package lab5
import chisel3._
import org.scalatest._
import chiseltest._

class Operatortests extends FreeSpec with ChiselScalatestTester{
    "Operator Test" in { 
        test(new Operator(4,UInt(4.W))(_+_)){ a=>
        a.io.in(0).poke(6.U)
        a.io.in(1).poke(2.U)
        a.io.in(2).poke(1.U)
        a.io.in(3).poke(3.U)
        
        a.clock.step(1)
        a.io.out(0).expect(12.U)
        a.io.out(1).expect(12.U)
        a.io.out(2).expect(12.U)
        a.io.out(3).expect(12.U)} } }