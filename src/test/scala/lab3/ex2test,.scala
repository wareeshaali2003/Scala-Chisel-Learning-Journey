// package lab3
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class ALUtest extends FreeSpec with ChiselScalatestTester{
//     "ALU Test" in { 
//         test(new ALU ()){ a=>
//         a.io.alu_Op.poke(0.U)
//         a.io.in_A.poke(2.U)
//         a.io.in_B.poke(3.U)
//          a.clock.step(10)
//         a.io.out.expect(5.U)}
//     }
// }