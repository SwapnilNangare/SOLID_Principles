package com.example.solidprinciples

/*
We should be able to use subclasses instead of the parent classes which class they have
extended, without the need to make any changes in our code. In simple words, the child class must be
substitutable for the parent class.
Since child classes extended from the parent classes, they inherit their behavior.
If child classes can not perform the behaviors belonging to the parent classes, probably, we won’t
 write any code in the method that does the behavior or we will throw an error when objects want to
  use it. But these actions cause code pollution and unnecessary code crowds.*/


abstract class Vehicle{
    protected var isEngineWorking = false
    abstract fun startEngine()
    abstract fun stopEngine()
    abstract fun moveForward()
    abstract fun moveBack()
}

class Car: Vehicle(){
    override fun startEngine() {
        println("Engine started")
        isEngineWorking = true
    }

    override fun stopEngine() {
        println("Engine stopped")
        isEngineWorking = false
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}

class Bicycle: Vehicle(){
    override fun startEngine() {
        // TODO("Not yet implemented")
    }

    override fun stopEngine() {
        // TODO("Not yet implemented")
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}