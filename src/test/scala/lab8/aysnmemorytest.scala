package lab8
import chisel3._
import org.scalatest._
import chiseltest._

class Asynch_Memtest extends FreeSpec with ChiselScalatestTester {
  "Asynch_Mem Test" in {
    test(new Asynch_Mem()) { a =>
      a.io.data_in(0).poke(2.U)
      a.io.data_in(1).poke(2.U)
      a.io.data_in(2).poke(2.U)
      a.io.data_in(3).poke(2.U)
      a.io.data_selector.poke(2.U)
      a.io.addr.poke(2.U)
      a.io.wr_en.poke(1.B) // Use 1.B for Bool inputs
      
      a.clock.step(20)
     
    }
  }
}
