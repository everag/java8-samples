package br.evertonagner.java8.optional;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {
        String strNull = methodThatReturnsNull();

        // *** COALESCING (if null then return something else) ***

        // Traditional null checking

        if (strNull != null) {
            System.out.println(strNull);
        } else {
            System.out.println("String was null");
        }

        // Optional<?> way

        System.out.println(Optional.ofNullable(strNull).orElse("String was null"));
        System.out.println(Optional.ofNullable(strNull).orElse(methodThatReturnsString()));

        // *** Throwing Exception if value is null ***

        // Traditional null checking

        String strNonNull = methodThatReturnsString();

        if (strNonNull != null) {
            System.out.println("String was not null");
        } else {
            throw new NullPointerException();
        }

        // Optional<?> way

        Optional.ofNullable(strNonNull).orElseThrow(() -> new NullPointerException()); // <- Lambda
        Optional.ofNullable(strNull).orElseThrow(NullPointerException::new); // <- Method Reference
    }

    private static String methodThatReturnsNull() {
        return null;
    }

    private static String methodThatReturnsString() {
        return "aloha";
    }

    private Optional<String> wrapStringInOptional(String str) {
        return Optional.ofNullable(str);
    }
}
