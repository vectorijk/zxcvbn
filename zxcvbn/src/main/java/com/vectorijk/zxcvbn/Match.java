package com.vectorijk.zxcvbn;

/**
 * Copyright (C) 2015 vectorijk <jiangkai@gmail.com>
 * Licensed under the MIT License.
 * http://opensource.org/licenses/MIT
 */

public abstract class Match {
    public abstract double getEntropy();

    public abstract String getToke();
}
