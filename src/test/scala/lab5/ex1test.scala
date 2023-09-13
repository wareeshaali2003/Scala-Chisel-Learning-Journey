package lab5
import chisel3._
import org.scalatest._
import chiseltest._

class ALUtest extends FreeSpec with ChiselScalatestTester{
    "ALU Test" in { 
        test(new ALU (2)){ a=>
        a.io.alu_oper.poke("b0001". U)
        a.io.arg_x .poke(1.U)
        a.io.arg_y.poke(1.U)
         a.clock.step(10)
        a.io.alu_out.expect(1.U)}
    }
}