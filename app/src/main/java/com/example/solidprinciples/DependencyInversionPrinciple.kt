package com.example.solidprinciples

/*This principle states that high-level modules should not depend on low-level modules.
 Both should depend on abstractions and Abstractions should not depend upon details. Details should
 depend upon abstractions.
Let’s assume that we need to develop a mobile application for both Android and iOS. To do that, we need an Android Developer and an iOS Developer. These classes will have a method to develop a mobile application by using their own platform and programming language.
* */

//class AndroidDeveloper{
//    fun developMobileApp(){
//        println("Developing Android Application by using Kotlin")
//    }
//}
//
//class IosDeveloper{
//    fun developMobileApp(){
//        println("Developing iOS Application by using Swift")
//    }
//}
//
//fun main(){
//    val androidDeveloper = AndroidDeveloper()
//    val iosDeveloper = IosDeveloper()
//
//    androidDeveloper.developMobileApp()
//    iosDeveloper.developMobileApp()
//}
// Solution

interface MobileDeveloper{
    fun developMobileApp()
}

class AndroidDeveloper(var mobileService: MobileServices): MobileDeveloper{
    override fun developMobileApp(){
        println("Developing Android Application by using Kotlin. " +
                "Application will work with ${mobileService.serviceName}")
    }
    enum class MobileServices(var serviceName: String){
        HMS("Huawei Mobile Services"),
        GMS("Google Mobile Services"),
        BOTH("Huawei Mobile Services and Google Mobile Services")
    }
}

class IosDeveloper: MobileDeveloper{
    override fun developMobileApp(){
        println("Developing iOS Application by using Swift")
    }
}

fun main(){
    val developers = arrayListOf(AndroidDeveloper(AndroidDeveloper.MobileServices.HMS), IosDeveloper())
    developers.forEach { developer ->
        developer.developMobileApp()
    }
}