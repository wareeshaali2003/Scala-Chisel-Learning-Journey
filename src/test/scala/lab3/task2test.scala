// package lab3
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class ImmdValGentest extends FreeSpec with ChiselScalatestTester{
//     "ImmdValGen Test" in { 
//         test(new ImmdValGen ()){a =>
//         a.io.instr.poke("b00000000011000110000001111100011".U)
//         // a.io.instr.poke(42.U)
//          a.clock.step(100)
//         a.io.immd_se.expect("b00000000000000000000010000000011".U)}
//     }
// }