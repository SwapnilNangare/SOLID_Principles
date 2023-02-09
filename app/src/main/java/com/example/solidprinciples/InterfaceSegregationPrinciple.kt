package com.example.solidprinciples

/*This principle states that once an interface becomes too fat, it needs to be split into smaller interfaces so that client of the
interface will only know about the methods that pertain to them.
So let’s think that we have an animal interface. And this interface will have methods about behaviors that animals do.
*/


/*
interface Animal {
    fun eat()
    fun sleep()
    fun fly()
}

class Cat : Animal {
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }

    override fun fly() {
        TODO("Not yet implemented") // Cats can't fly
    }
}

class Bird : Animal {
    override fun eat() {
        println("Bird is eating forage")
    }

    override fun sleep() {
        println("Bird is sleeping in the nest")
    }

    override fun fly() {
        println("Bird is flying so high")
    }
}
*/

// Solution

/*As you can see, in the above example that some animals can’t fly such as cats. So it will be unnecessary to implement the fly method.
To fix that issue, We will create a new Interface for flying animals and will remove the fly method from the animal interface.*/


interface Animal {
    fun eat()
    fun sleep()
}

interface FlyingAnimal {
    fun fly()
}

class Cat : Animal {
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }
}

class Bird : Animal, FlyingAnimal {
    override fun eat() {
        println("Bird is eating forage")
    }

    override fun sleep() {
        println("Bird is sleeping in the nest")
    }

    override fun fly() {
        println("Bird is flying so high")
    }
}

//



