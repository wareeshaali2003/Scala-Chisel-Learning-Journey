package lab5
import chisel3._
import org.scalatest._
import chiseltest._

class Mux2_to_1test extends FreeSpec with ChiselScalatestTester{
    "Mux2_to_1 Test" in { 
        test(new Mux2_to_1 (2.U)){ a=>
        a.io.in1.poke(1.U)
        a.io.in2 .poke(0.U)
        a.io.sel.poke(1.B)
         a.clock.step(10)
        a.io.out.expect(1.U)}
    }
}