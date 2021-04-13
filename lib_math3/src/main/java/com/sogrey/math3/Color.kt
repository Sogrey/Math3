package com.sogrey.math3

class Color {
    var r:Number=0
    var g:Number=0
    var b:Number=0

    constructor(r: Number, g: Number?, b: Number?) {
        if ( g ==null && b ==null ) {

            // r is THREE.Color, hex or string
            return this.set( r );

        }

        this.r = r
        this.g = g!!
        this.b = b!!
    }

    fun set(value: Number) {

    }


//    set( value ) {
//
//        if ( value && value.isColor ) {
//
//            this.copy( value );
//
//        } else if ( typeof value === 'number' ) {
//
//            this.setHex( value );
//
//        } else if ( typeof value === 'string' ) {
//
//            this.setStyle( value );
//
//        }
//
//        return this;
//
//    }

}