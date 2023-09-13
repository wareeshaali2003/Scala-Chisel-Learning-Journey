package singlecycle
import chisel3._ 
import chisel3.util._

trait Config {
val WLEN = 32
val ALUOP_SIG_LEN = 5
}

object ALUOP {
// ALU Operations , may expand / modify in future
val ALU_ADD = 0. U (4. W )
val ALU_SUB = 1. U (4. W )
val ALU_AND = 2. U (4. W )
val ALU_OR = 3. U (4. W )
val ALU_XOR = 4. U (4. W )
val ALU_SLT = 5. U (4. W )
val ALU_SLL = 6. U (4. W )
val ALU_SLTU = 7. U (4. W )
val ALU_SRL = 8. U (4. W )
val ALU_SRA = 9. U (4. W )
val ALU_COPY_A = 10. U (4. W )
val ALU_COPY_B = 11. U (4. W )
val ALU_XXX = 15. U (4. W )
}
import ALUOP._

class ALUIO extends Bundle with Config {
        val in_A = Input( SInt(WLEN.W) )
        val in_B = Input( SInt(WLEN.W) )
        val alu_Op = Input( UInt(ALUOP_SIG_LEN.W) )
        val out = Output( SInt(WLEN.W) )
}
class ALU extends Module with Config {
val io = IO ( new ALUIO )
io.out := 0.S
  val result = Mux(io.alu_Op === ALU_ADD, io.in_A + io.in_B, 0.S)
  io.out := result
}



