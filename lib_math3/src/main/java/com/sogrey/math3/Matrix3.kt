package com.sogrey.math3

class Matrix3 {

    var elements = arrayOf<Number>(
        1, 0, 0,
        0, 1, 0,
        0, 0, 1
    );

    fun set(
        n11: Number, n12: Number, n13: Number,
        n21: Number, n22: Number, n23: Number,
        n31: Number, n32: Number, n33: Number
    ): Matrix3 {

        val te = this.elements;

        te[0] = n11; te[1] = n21; te[2] = n31;
        te[3] = n12; te[4] = n22; te[5] = n32;
        te[6] = n13; te[7] = n23; te[8] = n33;

        return this;
    }

}