// package lab2
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class Mux_2to1test extends FreeSpec with ChiselScalatestTester{
//     "Mux_2to1Test" in { 
//         test(new Mux_2to1()){ a=>
//         a.io.in_A.poke(1.U)
//         a.io.in_B.poke(0.U)
//         a.io.select.poke(0.B)
//         a.io.out.expect(1.U)}
//     }
// }