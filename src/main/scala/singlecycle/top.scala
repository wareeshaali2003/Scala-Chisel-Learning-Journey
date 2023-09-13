package singlecycle
import chisel3._ 
import chisel3.util._

class Top extends Module {
  val io = IO(new Bundle {})

  val pcmodule = Module(new pc)
  val alumodule = Module(new ALU)
  val alucontolmod = Module(new alucntr)
  val ctrnmod = Module(new control)
  val datamem_mod = Module(new data_Mem)
  val instrmem_mod = Module(new instr_Mem)
  val regfilemod = Module(new RegFile)

  // pcv
  pcmodule.io.in := pcmodule.io.pc4

  // instruction
  instrmem_mod.io.addr := pcmodule.io.pc(21, 2)

  // control
  ctrnmod.io.instr := instrmem_mod.io.addr(6, 0)

  // register file
  regfilemod.io.rs1 := instrmem_mod.io.addr(19, 15)
  regfilemod.io.rs2 := instrmem_mod.io.addr(24, 20)
  regfilemod.io.rd := instrmem_mod.io.addr(11, 7)

  // alucontrol
  alucontolmod.io.func3 := instrmem_mod.io.addr(14, 12)
  alucontolmod.io.func7 := instrmem_mod.io.addr(30)

  // control read and write
  datamem_mod.io.wen := ctrnmod.io.memwrite
  datamem_mod.io.ren := ctrnmod.io.memread

  // regfile write
  regfilemod.io.wen := ctrnmod.io.regwrite
  datamem_mod.io.data := regfilemod.io.rdata2
  

  // control to alu
  alucontolmod.io.aluop := ctrnmod.io.aluop

  // ALU
  
// opA mux
alumodule.io.in_A := MuxCase(0.S, Array(
  (ctrnmod.io.opA === 0.S) -> regfilemod.io.rdata1,
))
 datamem_mod.io.addr:= alumodule.io.out
    alumodule.io.alu_Op := alucontolmod.io.alucontrol
// opB mux
alumodule.io.in_B := MuxCase(0.S, Array(
  (ctrnmod.io.opB === 0.S) -> regfilemod.io.rdata2,
))


// controlmod
regfilemod.io.wdata := MuxCase(0.S, Array(
  (ctrnmod.io.memtoreg === 0.B) -> alumodule.io.out,
  (ctrnmod.io.memtoreg === 1.B) -> datamem_mod.io.output
))
}
