// package lab2
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class Mux_8to1test extends FreeSpec with ChiselScalatestTester{
//     "Mux_8to1Test" in { 
//         test(new Mux_8to1()){ a=>
//         a.io.in0.poke(0.B)
//         a.io.in1.poke(1.B)
//         a.io.in2.poke(0.B)
//         a.io.in3.poke(1.B)
//         a.io.in4.poke(0.B)
//         a.io.in5.poke(1.B)
//         a.io.in6.poke(0.B)
//         a.io.in7.poke(1.B)
//         a.io.s0.poke(1.B)
//         a.io.s1.poke(3.U)
//         a.io.s2.poke(2.U)
//         a.io.out.expect(0.B)}
//     }
// }