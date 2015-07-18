package com.vectorijk.zxcvbn;

/**
 * Copyright (C) 2015 vectorijk <jiangkai@gmail.com>
 * Licensed under the MIT License.
 * http://opensource.org/licenses/MIT
 */

public class dictionaryMatch extends Match{

    @Override
    public double getEntropy() {
        return 0;
    }

    @Override
    public String getToke() {
        return null;
    }
}
