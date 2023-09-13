package lab6
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class counter2test  extends FreeSpec with ChiselScalatestTester {
    "counter2 Test" in {
        test(new counter2(13,4)){c=>
        c.clock.step(4)
        c.io.out.expect(8.U)


        }
    }
}