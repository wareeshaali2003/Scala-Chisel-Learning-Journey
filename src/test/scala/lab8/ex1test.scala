package lab8
import chisel3._
import org.scalatest._
import chiseltest._

class MaskedReadWriteSmemtest extends FreeSpec with ChiselScalatestTester{
    "MaskedReadWriteSmem Test" in { 
        test(new MaskedReadWriteSmem()){ a=>
        a.io.enable.poke(1.B)
        a.io.write.poke(1.B)
        a.io.addr.poke(2.U)
        a.io.mask(0).poke(1.B)
        a.io.mask(1).poke(1.B)
        a.io.mask(2).poke(1.B)
        a.io.mask(3).poke(1.B)
        a.io.dataIn(0).poke(1.U)
        a.io.dataIn(1).poke(1.U)
        a.io.dataIn(2).poke(1.U)
        a.io.dataIn(3).poke(1.U)
        a.clock.step(20)
    
        //c.io.result.expect(0.B)
        
        }
    }
}