package com.sogrey.math3

class Vector2 constructor(x: Double? = 0.0, y: Double? = 0.0) {
    var x: Double = 0.0
    var y: Double = 0.0

    init {
        this.x = x!!
        this.y = y!!
    }

    fun set(x: Double, y: Double): Vector2 {
        this.x = x
        this.y = y
        return this
    }

    /**
     * 判断传入的 number 是什么数据类型
     */
    fun checkNumber(num: Number) {
        when (num) {
            is Int -> println("number is Int")
            is Double -> println("number is Double")
            else -> println("number not support")
        }
    }

    fun clone(): Vector2 {
        return Vector2(this.x, this.y)
    }

    fun copy(v: Vector2): Vector2 {
        this.x = v.x;
        this.y = v.y;

        return this;
    }

    fun add(v: Vector2, w: Vector2?): Vector2 {
        if (w != null) {
            return this.addVectors(v, w)
        }

        this.x = v.x
        this.y = v.y

        return this
    }

    fun addVectors(a: Vector2, b: Vector2): Vector2 {
        this.x = a.x + b.x
        this.y = a.y + b.y

        return this
    }

    fun addScalar(s: Double): Vector2 {
        this.x += s
        this.y += s

        return this
    }

    fun addScaledVector(v: Vector2, s: Double): Vector2 {
        this.x += v.x * s
        this.y += v.y * s

        return this
    }

    fun sub(v: Vector2, w: Vector2?): Vector2 {
        if (w != null) {
            return this.subVectors(v, w)
        }

        this.x -= v.x
        this.y -= v.y

        return this
    }

    fun subScalar(s: Double): Vector2 {
        this.x -= s
        this.y -= s

        return this
    }

    fun subVectors(a: Vector2, b: Vector2): Vector2 {
        this.x = a.x - b.x
        this.y = a.y - b.y

        return this
    }

    fun multiply(v: Vector2): Vector2 {
        this.x *= v.x
        this.y *= v.y

        return this
    }

    fun multiplyScalar(scalar: Double): Vector2 {
        this.x *= scalar
        this.y *= scalar

        return this
    }

    fun divide(v: Vector2): Vector2 {
        this.x /= v.x
        this.y /= v.y

        return this
    }

    fun divideScalar(scalar: Double): Vector2 {
        return this.multiplyScalar(1 / scalar)
    }

//    applyMatrix3( m )
//    {
//
//        const x = this.x, y = this.y;
//        const e = m . elements;
//
//        this.x = e[0] * x + e[3] * y + e[6];
//        this.y = e[1] * x + e[4] * y + e[7];
//
//        return this;
//
//    }
//
//    min( v )
//    {
//
//        this.x = Math.min(this.x, v.x);
//        this.y = Math.min(this.y, v.y);
//
//        return this;
//
//    }
//
//    max( v )
//    {
//
//        this.x = Math.max(this.x, v.x);
//        this.y = Math.max(this.y, v.y);
//
//        return this;
//
//    }
//
//    clamp( min, max )
//    {
//
//        // assumes min < max, componentwise
//
//        this.x = Math.max(min.x, Math.min(max.x, this.x));
//        this.y = Math.max(min.y, Math.min(max.y, this.y));
//
//        return this;
//
//    }
//
//    clampScalar( minVal, maxVal )
//    {
//
//        this.x = Math.max(minVal, Math.min(maxVal, this.x));
//        this.y = Math.max(minVal, Math.min(maxVal, this.y));
//
//        return this;
//
//    }
//
//    clampLength( min, max )
//    {
//
//        const length = this.length();
//
//        return this.divideScalar(length || 1).multiplyScalar(Math.max(min, Math.min(max, length)));
//
//    }
//
//    floor()
//    {
//
//        this.x = Math.floor(this.x);
//        this.y = Math.floor(this.y);
//
//        return this;
//
//    }
//
//    ceil()
//    {
//
//        this.x = Math.ceil(this.x);
//        this.y = Math.ceil(this.y);
//
//        return this;
//
//    }
//
//    round()
//    {
//
//        this.x = Math.round(this.x);
//        this.y = Math.round(this.y);
//
//        return this;
//
//    }
//
//    roundToZero()
//    {
//
//        this.x = (this.x < 0) ? Math.ceil(this.x) : Math.floor(this.x);
//        this.y = (this.y < 0) ? Math.ceil(this.y) : Math.floor(this.y);
//
//        return this;
//
//    }
//
//    negate()
//    {
//
//        this.x = -this.x;
//        this.y = -this.y;
//
//        return this;
//
//    }
//
//    dot( v )
//    {
//
//        return this.x * v.x + this.y * v.y;
//
//    }
//
//    cross( v )
//    {
//
//        return this.x * v.y - this.y * v.x;
//
//    }
//
//    lengthSq()
//    {
//
//        return this.x * this.x + this.y * this.y;
//
//    }
//
//    length()
//    {
//
//        return Math.sqrt(this.x * this.x + this.y * this.y);
//
//    }
//
//    manhattanLength()
//    {
//
//        return Math.abs(this.x) + Math.abs(this.y);
//
//    }
//
//    normalize()
//    {
//
//        return this.divideScalar(this.length() || 1);
//
//    }
//
//    angle()
//    {
//
//        // computes the angle in radians with respect to the positive x-axis
//
//        const angle = Math . atan2 (-this.y, -this.x)+Math.PI;
//
//        return angle;
//
//    }
//
//    distanceTo( v )
//    {
//
//        return Math.sqrt(this.distanceToSquared(v));
//
//    }
//
//    distanceToSquared( v )
//    {
//
//        const dx = this.x - v.x, dy = this.y-v.y;
//        return dx * dx + dy * dy;
//
//    }
//
//    manhattanDistanceTo( v )
//    {
//
//        return Math.abs(this.x - v.x) + Math.abs(this.y - v.y);
//
//    }
//
//    setLength( length )
//    {
//
//        return this.normalize().multiplyScalar(length);
//
//    }
//
//    lerp( v, alpha )
//    {
//
//        this.x += (v.x - this.x) * alpha;
//        this.y += (v.y - this.y) * alpha;
//
//        return this;
//
//    }
//
//    lerpVectors( v1, v2, alpha )
//    {
//
//        this.x = v1.x + (v2.x - v1.x) * alpha;
//        this.y = v1.y + (v2.y - v1.y) * alpha;
//
//        return this;
//
//    }
//
//    equals( v )
//    {
//
//        return ((v.x === this.x) && (v.y === this.y));
//
//    }
//
//    fromArray( array, offset = 0 )
//    {
//
//        this.x = array[offset];
//        this.y = array[offset + 1];
//
//        return this;
//
//    }
//
//    toArray( array = [], offset = 0 )
//    {
//
//        array[offset] = this.x;
//        array[offset + 1] = this.y;
//
//        return array;
//
//    }
//
//    fromBufferAttribute( attribute, index, offset )
//    {
//
//        if (offset !== undefined) {
//
//            console.warn('THREE.Vector2: offset has been removed from .fromBufferAttribute().');
//
//        }
//
//        this.x = attribute.getX(index);
//        this.y = attribute.getY(index);
//
//        return this;
//
//    }
//
//    rotateAround( center, angle )
//    {
//
//        const c = Math . cos (angle), s = Math.sin(angle);
//
//        const x = this.x - center.x;
//        const y = this.y - center.y;
//
//        this.x = x * c - y * s + center.x;
//        this.y = x * s + y * c + center.y;
//
//        return this;
//
//    }
//
//    random()
//    {
//
//        this.x = Math.random();
//        this.y = Math.random();
//
//        return this;
//
//    }
}
