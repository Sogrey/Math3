package com.sogrey.math3

class Box2 constructor(min: Vector2, max: Vector2) {
    var min: Vector2 =  Vector2()
    var max: Vector2=  Vector2()

    init {
        this.min = min
        this.max = max
    }

    fun set(min: Vector2, max: Vector2): Box2 {
        this.min = min
        this.max = max
        return this
    }
}