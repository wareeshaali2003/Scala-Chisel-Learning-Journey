// Task 2: Define a class in Scala that implements an up-down counter. The counter starts from 0,
// counts up to a pre-defined value and then counts down to zero. It must repeats it counting and set
// io.out to high for one clock cycle when it reach either maximum or minimum values.
package lab1
import chisel3 . _
import chisel3 . util . _
import java . io . File
class counter_up_down ( n : Int ) extends Module {
val io = IO ( new Bundle {
val out = Output ( Bool () )

})
io.out:=0.U
var count = RegInit (0. U ( n . W ) )
val max_count = RegInit (6. U ( n . W ) )
val min = RegInit(0.U)
when(count=/=max_count && min===0.U)
{
    
    count := count + 1. U
    io.out := true.B
}
.elsewhen(count===max_count)
{
    min := 1.U
    count := count - 1.U
    io.out := false.B
}
.elsewhen(count===0.U)
{
    min:=0.U
    count := count + 1. U
    io.out := true.B
}
.elsewhen(min===1.U)
{
    count := count - 1. U
    io.out := true.B
}
}