package lab4
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
// import chiseltest.internal.VerilatorBackendAnnotation
import scala.util.Random


class ImmdValGen1test  extends FreeSpec with ChiselScalatestTester {
"ImmdValGen1 Test" in {
test ( new ImmdValGen1() ) { c =>
// ALU operations

val array_op = Array ( "b00000000011000110000001110010011","b00000000011000110000001110100011",
"b00000000011000110000001110110111","b00000000011000110000001111100011",
"b00000000011000110000001111101111")

for ( i <- 0 until 100) {

val opr = Random.nextInt(5)
val types = array_op (opr)

// ALU functional implementation using Scala match
val result = types match {
case "b00000000011000110000001110010011" => 6
case "b00000000011000110000001110100011" => 7
case "b00000000011000110000001110110111" => 1584
case "b00000000011000110000001111100011" => 1027
case "b00000000011000110000001111101111" => 98307}

c.io.instr.poke(types.U)
c.clock.step (1)
c.io.immd_se.expect (result.U)
}
}
}
}