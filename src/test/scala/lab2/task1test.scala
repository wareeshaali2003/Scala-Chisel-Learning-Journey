// package lab2
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class Mux_5to1test extends FreeSpec with ChiselScalatestTester{
//     "Mux_5to1Test" in { 
//         test(new Mux_5to1()){ a=>
//         a.io.s0.poke(0.B)
//         a.io.s1.poke(0.B)
//         a.io.s2.poke(0.B)
//         a.io.out.expect(0.U)}
//     }
// }