// Exercise 2: Make the counter to reset its count to 0 when its MSB (most significant bit) changes
// from 0 to 1.
package lab1
import chisel3._
import chisel3.util._
class Counter1 ()  extends Module {
val io = IO ( new Bundle {
val result = Output ( Bool () )
})

val count = RegInit (4.U (3.W ) )
when ( count(2.U) === 1.B) {
count := 0. U
} .otherwise {
count := count + 1. U
}
io . result := count (2. U )

}