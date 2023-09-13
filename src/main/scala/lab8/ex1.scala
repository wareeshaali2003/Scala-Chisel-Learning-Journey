package lab8
import chisel3._
import chisel3.util._
class MaskedReadWriteSmem extends Module {
val width : Int = 32
val io = IO (new Bundle {
val enable = Input ( Bool () )
val write = Input ( Bool () )
val addr = Input ( UInt (10. W ) )
val mask = Input ( Vec (4 , Bool () ) )
val dataIn = Input ( Vec (4 , UInt ( width . W ) ) )
val dataOut = Output ( Vec (4 , UInt ( width . W ) ) )
})
// Create a 32 - bit wide memory that is byte - masked
val mem = SyncReadMem (1024 , Vec (4 , UInt ( width . W ) ) )
// Write with mask
val mk = Reg(Vec(4, UInt( width . W )))

mk(0) := 0.U( width . W )
mk(1) := 0.U( width . W )
mk(2) := 0.U( width . W )
mk(3) := 0.U( width . W )

 when(io.enable === 1.B){
        // val mask1 = Cat(io.mask(3),io.mask(2),io.mask(1),io.mask(0))
        when(io.mask(0) ){
            mk(0) := io.dataIn(0)
        }.otherwise {
            mk(0) := 0.U(width . W)
        }
            // mem.write(io.addr, mk)}
         when(io.mask(1) ){
            mk(1) := io.dataIn(1)
        }.otherwise {
            mk(1) := 0.U(width . W)
        }
          when(io.mask(2) ){
            mk(2) := io.dataIn(2)
        }.otherwise {
            mk(2) := 0.U(width . W)
        }
           when(io.mask(2) ){
            mk(2) := io.dataIn(2)
        }.otherwise {
            mk(2) := 0.U(width . W)
        }
            when(io.mask(3) ){
            mk(3) := io.dataIn(3)
        }.otherwise {
            mk(3) := 0.U(width . W)
        }

mem.write(io.addr, mk)
}

io . dataOut := mem . read ( io . addr , io . enable )
}