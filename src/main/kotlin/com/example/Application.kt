package com.example

import io.micronaut.runtime.Micronaut.run
fun main(args: Array<String>) {
	new_value()
	run(*args)
}

fun new_value(){
	println("Hellow orld")
}

