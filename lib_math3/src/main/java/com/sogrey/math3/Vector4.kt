package com.sogrey.math3

class Vector4 constructor(x: Number? = 0.0, y: Number? = 0.0, z: Number? = 0.0, w: Number? = 0.0) {
    var x: Number = 0.0
    var y: Number = 0.0
    var z: Number = 0.0
    var w: Number = 0.0

    init {
        this.x = x!!
        this.y = y!!
        this.z = z!!
        this.w = w!!
    }

    fun set(x: Number, y: Number, z: Number, w: Number): Vector4 {
        this.x = x
        this.y = y
        this.z = z
        this.w = w
        return this
    }
}