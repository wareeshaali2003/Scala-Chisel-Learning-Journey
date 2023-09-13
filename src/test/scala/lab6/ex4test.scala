package lab6
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._


class  My_QueueTest extends FreeSpec with ChiselScalatestTester {

  " My_Queue test" in {
    test(new My_Queue) { a=>
      a.io.in.bits.poke(4.U)
      a.io.in.valid.poke(1.B)
      a.clock.step(1)
      a.io.out.ready.poke(1.B)
      a.io.out.bits.expect(4.U)
    }
  }
}