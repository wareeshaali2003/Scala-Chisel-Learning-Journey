// package lab3
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class BranchControltest extends FreeSpec with ChiselScalatestTester{
//     "BranchControl Test" in { 
//         test(new BranchControl ()){ a=>
//         a.io.fnct3.poke(0.U)
//         a.io.branch.poke(1.B)
//         a.io.arg_x .poke(1.U)
//         a.io.arg_y .poke(1.U)
//          a.clock.step(10)
//         a.io.br_taken.expect(1.B)}
//     }
// }