// package lab2
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class barrel_shifttest extends FreeSpec with ChiselScalatestTester{
//     "barrel_shiftTest" in { 
//         test(new barrel_shift()){ a=>
//         a.io.in(0).poke(1.B)
//         a.io.in(1).poke(1.B)
//         a.io.in(2).poke(1.B)
//         a.io.in(3).poke(1.B)
//         a.io.sel(0).poke(0.B)
//         a.io.sel(1).poke(0.B)
//         a.io.shift_type.poke(0.B)
//         a.io.out(0).expect(1.B)
//         a.io.out(1).expect(1.B)
//         a.io.out(2).expect(1.B)
//         a.io.out(3).expect(1.B)
//         }
//     }
// }