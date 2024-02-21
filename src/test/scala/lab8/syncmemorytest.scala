// package lab8
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class Parameterized_Memtest extends FreeSpec with ChiselScalatestTester {
//   "Parameterized_Mem Test" in {
//     test(new Parameterized_Mem()) { a =>
//       a.io.dataIn.poke(2.U)
//       a.io.addr.poke(2.U)
//       a.io.rd_enable.poke(1.B)
//       a.io.wr_enable.poke(1.B)
//       a.clock.step(20)
     
//     }
//   }
// }
