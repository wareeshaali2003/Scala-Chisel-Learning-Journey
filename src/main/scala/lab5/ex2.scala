package lab5
import chisel3 . _
import chisel3 . util . _
class IO_Interface1 [ T <: Data ] ( data_type : T ) extends Bundle {
val out = Output ( data_type . cloneType )
val in1 = Input ( data_type . cloneType )
val in2 = Input ( data_type . cloneType )
val sel = Input ( Bool () )
}
class  Mux2_to_1 ( size : UInt ) extends Module {
val io = IO (new IO_Interface1 ( size ) )
io . out := Mux(io . sel,  io . in1 ,  io . in2 )
}

