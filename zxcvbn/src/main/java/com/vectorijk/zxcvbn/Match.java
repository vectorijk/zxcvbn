package com.vectorijk.zxcvbn;

import java.util.regex.Pattern;

/**
 * Copyright (C) 2015 vectorijk <jiangkai@gmail.com>
 * Licensed under the MIT License.
 * http://opensource.org/licenses/MIT
 */

public abstract class Match {
    public abstract double getEntropy();

    public abstract String getToke();

    public static void findAll(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);

    }
}
