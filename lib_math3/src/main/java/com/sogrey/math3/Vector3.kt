package com.sogrey.math3

class Vector3 constructor(x: Number? = 0.0, y: Number? = 0.0, z: Number? = 0.0) {
    var x: Number = 0.0
    var y: Number = 0.0
    var z: Number = 0.0

    init {
        this.x = x!!
        this.y = y!!
        this.z = z!!
    }

    fun set(x: Number, y: Number, z: Number): Vector3 {
        this.x = x
        this.y = y
        this.z = z
        return this
    }
}