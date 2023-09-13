package lab5
import chisel3._
import chisel3.util._

class Adder( Width:Int=1 ) extends Module {
require ( Width >= 0)
// your code begin from here
val io = IO (new Bundle {
val in0 = Input(UInt ( Width.W ))
val in1 = Input(UInt ( Width.W ))
val out = Output(UInt ( Width.W ))

})

io.out:= io.in0+io.in1



// your code end here
}