package lab5
import chisel3._
import org.scalatest._
import chiseltest._

class Addertest extends FreeSpec with ChiselScalatestTester{
    "AdderTest" in { 
        test(new Adder(3) ){ a=>
        a.io.in0.poke(4. U)
        a.io.in1 .poke(1.U)
         a.clock.step(10)
        a.io.out.expect(5.U)}
    }
}