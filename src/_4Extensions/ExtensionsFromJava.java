package _4Extensions;

import _4Extensions.extensions.ExtensionsExampleKt;

import static _4Extensions.extensions.ExtensionsExampleKt.lastChar;

public class ExtensionsFromJava {
    public static void main(String[] args) {

        ExtensionsExampleKt.lastChar("abc");
        lastChar("abc");
    }
}
