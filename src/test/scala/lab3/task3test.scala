// package lab3
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class task3test extends FreeSpec with ChiselScalatestTester{
//     "valid Test" in { 
//         test(new decoder_with_valid ()){a =>
//         a.io.in.poke("b00".U)
//         // a.io.instr.poke(42.U)
//          a.clock.step(100)
//         a.io.out.bits.expect("b0001".U)
//         a.io.out.valid.expect(1.B)
//     }
//     }
// }