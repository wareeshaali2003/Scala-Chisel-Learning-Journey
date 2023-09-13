// package lab6
// import chisel3._
// import chisel3.util._

// class shift_register ( val init : Int = 1) extends Module {
// val io = IO (new Bundle {
// val in = Input ( UInt (4. W ) )
// val out = Output ( UInt (4. W ) )
// })

// val state = RegInit ( init . U (4. W ) ) // register initialization
// val nextState = ( state >> 1) | io . in
// state := nextState
// io . out := state
// }


