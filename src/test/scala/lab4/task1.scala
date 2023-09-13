package lab4
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
// import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random
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

class TestBranchControl1  extends FreeSpec with ChiselScalatestTester {
"BranchControl1 Test" in {
test ( new BranchControl1() ) { c =>
// ALU operations
val array_op = Array (beq, bne, blt, bge, bltu, bgeu)
for ( i <- 0 until 100) {
val arg_x = Random.nextLong() & 0xFFFFFFFFL
val arg_y  = Random.nextLong() & 0xFFFFFFFFL
val opr = Random.nextInt(6)
val fnct3 = array_op (opr)
val branch = Random.nextBoolean()
// ALU functional implementation using Scala match
val result = fnct3 match {
case  beq =>   (arg_x === arg_y).B
case bne =>  (arg_x != arg_y).B
case blt =>  (arg_x >  arg_y).B
case bge =>  (arg_x <  arg_y).B
case bltu => (arg_x <=  arg_y).B
case bgeu => (arg_x >=  arg_y ).B
case _ => 0.B
}
if ( branch === 1.B) 
   { c.io.br_taken.expect( result )}
else
   { c.io.br_taken.expect( result )}
c.io.arg_x.poke(arg_x.U)
c.io.arg_y.poke(arg_y.U)
c.clock.step(1)
c.io.fnct3.poke(fnct3)
}
}
}
}