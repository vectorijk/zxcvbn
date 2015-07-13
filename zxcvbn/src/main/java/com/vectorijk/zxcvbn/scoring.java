package com.vectorijk.zxcvbn;

/**
 * Copyright (C) 2015 vectorijk <jiangkai@gmail.com>
 * Licensed under the MIT License.
 * http://opensource.org/licenses/MIT
 */

public class scoring {
    private int nCk(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0) {
            return 1;
        }
        int r = 1;
        int d;
        for (d = 1; d <= k; d++) {
            r *= n;
            r /= d;
            n -= 1;
        }
        return r;
    }

    private double lg(int n) {
        return Math.log(n) * 1.0 / Math.log(2);
    }
}
