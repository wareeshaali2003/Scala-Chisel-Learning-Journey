package lab3
import chisel3._
import org.scalatest._
import chiseltest._

class encoder4to2test extends FreeSpec with ChiselScalatestTester{
    "encoder4to2Test" in { 
        test(new encoder4to2()){ a=>
        a.io.in.poke(3.U)
        a.io.out.expect(3.U)}
    }
}