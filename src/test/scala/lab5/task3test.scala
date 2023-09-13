package lab5
import chisel3._
import chisel3 . util . _
import org.scalatest._
import chiseltest._

class eMuxtests extends FreeSpec with ChiselScalatestTester{
    "eMux Test" in { 
        test(new eMux (UInt(4.W),SInt(4.W))){ a=>
        a.io.in1.poke(0.U)
        a.io.in2.poke(1.S)
        a.io.sel.poke(1.B)
        
        a.clock.step(1)
        a.io.out.expect(1.U)
       } } }