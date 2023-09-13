// //lab 2 task2
// package lab2
// import chisel3._
// import chisel3.util._
// class barrel_shift extends Module {
// val io = IO (new Bundle {
// val in = Vec (4 , Input ( Bool () ) )
// val sel = Vec (2 , Input ( Bool () ) )
// val shift_type = Input ( Bool () )
// val out = Vec (4 , Output ( Bool () ) )
// })
// // Start you code here
// val s = Cat(io.sel(0),io.sel(1))
// val mux1 = MuxCase(false .B , Array (
// ( io.shift_type ===0. B) -> 0.B ,
// ( io.shift_type ===1. B ) -> io.in(0) ))

// val mux2 = MuxCase(false .B , Array (
// ( io.shift_type ===0. B ) -> 0.B ,
// ( io.shift_type ===1. B ) -> io.in(1) ))

// val mux3 = MuxCase(false .B , Array (
// ( io.shift_type ===0. B ) -> 0.B ,
// ( io.shift_type ===1. B ) -> io.in(2) ))

//  io.out(0) := MuxCase(false .B , Array (
// ( s ===0. U ) -> io.in(0),
// ( s ===1. U ) -> io.in(1),
// ( s ===2. U ) -> io.in(2),
// ( s ===3. U ) -> io.in(3) ))

// io.out(1) := MuxCase(false .B , Array (
// ( s ===0. U ) -> io.in(1),
// ( s ===1. U ) -> io.in(2),
// ( s ===2. U ) -> io.in(3),
// ( s ===3. U ) -> mux1 ))

// io.out(2) := MuxCase(false .B , Array (
// ( s ===0. U ) -> io.in(2),
// ( s ===1. U ) -> io.in(3),
// ( s ===2. U ) -> mux1,
// ( s ===3. U ) -> mux2 ))

// io.out(3) := MuxCase(false .B , Array (
// ( s ===0. U ) -> io.in(3),
// ( s ===1. U ) -> mux1,
// ( s ===2. U ) -> mux2,
// ( s ===3. U ) -> mux3 ))


// // End your code here
// }