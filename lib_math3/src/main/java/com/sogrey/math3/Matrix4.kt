package com.sogrey.math3

class Matrix4 {

    var elements = arrayOf<Number>(
        1, 0, 0, 0,
        0, 1, 0, 0,
        0, 0, 1, 0,
        0, 0, 0, 1
    );

    fun set(
        n11: Number, n12: Number, n13: Number, n14: Number,
        n21: Number, n22: Number, n23: Number, n24: Number,
        n31: Number, n32: Number, n33: Number, n34: Number,
        n41: Number, n42: Number, n43: Number, n44: Number
    ): Matrix4 {

        val te = this.elements;

        te[0] = n11; te[4] = n12; te[8] = n13; te[12] = n14;
        te[1] = n21; te[5] = n22; te[9] = n23; te[13] = n24;
        te[2] = n31; te[6] = n32; te[10] = n33; te[14] = n34;
        te[3] = n41; te[7] = n42; te[11] = n43; te[15] = n44;

        return this;
    }

}