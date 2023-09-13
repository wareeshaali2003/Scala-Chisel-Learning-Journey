package lab6
import chisel3._
import chisel3.util._

class up_down_counter1(val max: Int = 10) extends Module {
  val io = IO(new Bundle {
    val out = Output(UInt(log2Ceil(max).W))
    val up_down = Input(Bool())
  })

  // Start code here
  io.out := 0.U
  var count = RegInit(0.U(max.W))
  val updown = RegInit(io.up_down)

  when(count =/= max.U && updown === 1.B) {
    count := count + 1.U
  }.elsewhen(count === max.U) {
    updown := 0.B
    count := count - 1.U
  }.elsewhen(count === 0.U) {
    updown := 1.B
    count := count + 1.U
  }.elsewhen(io.up_down === 0.B) {
    count := count - 1.U
  }

  io.out := count
  // End your code here
}