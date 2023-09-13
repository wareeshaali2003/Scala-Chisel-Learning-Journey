package singlecycle
import chisel3._ 
import chisel3.util._

class control extends Module {
    val io = IO(new Bundle{
        val instr =  Input ( UInt (7. W ) )
        val memwrite = Output(Bool())
        // val Branch = Output(Bool())
        val memread = Output(Bool())
        val regwrite =  Output(Bool())
        val memtoreg = Output(Bool())
        val aluop =  Output(UInt(3.W))
        val opA = Output(SInt(2.W))
        val opB = Output(SInt(1.W))
        // val extendsel =  Output(UInt(2.W))
        // val next_pc_sel = Output(UInt(2.W))
    })
  io.memwrite := false.B
  // io.Branch := false.B
  io.memread := false.B
  io.regwrite := false.B
  io.memtoreg := false.B
  io.aluop := 0.U
  io.opA := 0.S
  io.opB := 0.S
  // io.extendsel := 0.U
  // io.next_pc_sel := 0.U
  
    when(io.instr === "b0110011".U) {
    io.memwrite:= 0.U
    // io.Branch:= 0.U
    io.memread := 0.U
    io.regwrite := 1.U
    io.memtoreg := 0.U
    io.aluop := 0.U
    io.opA := 0.S
    io.opB := 0.S
    // io.extendsel := 0.U
    // io.next_pc_sel := 0.U
  }
    }
