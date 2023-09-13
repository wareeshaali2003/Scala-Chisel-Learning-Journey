// Branch control ( Assignment )
package lab4
import chisel3 . _
import chisel3 . util . _
class LM_IO_Interface_BranchControl1 extends Bundle {
val fnct3 = Input ( UInt (3. W ) )
val branch = Input ( Bool () )
val arg_x = Input ( UInt (32. W ) )
val arg_y = Input ( UInt (32. W ) )
val br_taken = Output ( Bool () )
}
object fnct3 {
// ALU Operations , may expand / modify in future
val beq = 0. U (4. W )
val bne = 1. U (4. W )
val blt = 2. U (4. W )
val bge = 3. U (4. W )
val bltu = 4. U (4. W )
val bgeu = 5. U (4. W )
}
import fnct3._
class BranchControl1 extends Module {
val io = IO ( new LM_IO_Interface_BranchControl1 )
// Start Coding here
io . br_taken  := 0.B
switch ( io.fnct3 ) {
    is ( beq ) {
        val con = io.arg_x === io.arg_y
        io . br_taken  := io . branch && con 
}
is ( bne ) {
    val con = io.arg_x =/= io.arg_y
    io . br_taken  := io . branch && con 
}
is (blt) {
    val con = io.arg_x > io.arg_y
    io . br_taken  := io . branch && con 
}
is (bge) {
    val con = io.arg_x < io.arg_y
    io . br_taken  := io . branch && con 
}
is (bltu) {
    val con = io.arg_x <= io.arg_y
    io . br_taken  := io . branch && con 
}
is (bgeu) {
    val con = io.arg_x >= io.arg_y 
    io . br_taken  := io . branch && con 
}
}}
// End your code here
// Well , you can actually write classes too . So , technically you have no

