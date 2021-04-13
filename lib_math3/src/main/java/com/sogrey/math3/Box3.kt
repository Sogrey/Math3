package com.sogrey.math3

class Box3 constructor(min: Vector3, max: Vector3) {
    var min: Vector3 =  Vector3()
    var max: Vector3=  Vector3()

    init {
        this.min = min
        this.max = max
    }

    fun set(min: Vector3, max: Vector3): Box3 {
        this.min = min
        this.max = max
        return this
    }
}