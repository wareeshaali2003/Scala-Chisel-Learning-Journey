package lab6
import chisel3 . _
import chisel3 . util . _
// import chisel3 . iotesters .{ ChiselFlatSpec , Driver , PeekPokeTester }
class My_Queue extends Module {
val io = IO ( new Bundle {
val in = Flipped ( Decoupled ( UInt (8. W ) ) ) // valid = Input , ready = Output , bits = Input
val out = Decoupled ( UInt (8. W ) ) // valid = Output , ready = Input , bits = Output
})

val queue = Queue ( io . in , 5) // 5 - element queue
val queue1 = Queue ( queue , 5)
io.out <> queue
io.out <> queue1 
io.out.bits := 0. U
io.out.valid := 0.B
io.out.ready := 0.B
    when(io.out.valid === 1.B && io.out.ready === 1.B){
        io.out.enq(queue.deq())
        io.out.enq(queue1.deq())

    }.otherwise{
        // Connect the output of queue1 to the input of queue
        queue.enq(0.U) <> queue1.deq()
        io.out.bits := 0.U
        io.out.valid := 0.B
        io.out.ready := 0.B
    }

}

