// package lab6
// import chisel3._
// import chisel3.util._
// class counter_with_xor ( val max : Int = 1) extends Module {
// val io = IO (new Bundle {
// val out = Output ( UInt (( log2Ceil ( max ) . W ) ) )
// })
// // Start Coding here
//   val count = RegInit(0.U((log2Ceil(max)).W))
//   val m  = count(log2Ceil(max) - 1) 
//   val re = m ^ 1.U

//   when(count(re)) {
//     count := 0.U
//   }.otherwise {
//     count := count + 1.U
//   }
//   io.out := count

// // End your code here
// }