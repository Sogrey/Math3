package com.sogrey.math3

class Vector2 constructor(x: Number? = 0.0, y: Number? = 0.0) {
    var x: Number = 0.0
    var y: Number = 0.0

    init {
        this.x = x!!
        this.y = y!!
    }

    fun set(x: Number, y: Number): Vector2 {
        this.x = x
        this.y = y
        return this
    }
}