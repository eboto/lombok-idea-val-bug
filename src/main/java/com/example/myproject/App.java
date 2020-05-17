package com.example.myproject;

import lombok.val;
import java.util.Optional;

public class App {
  public static void main(String... args) {
    val strOpt = Optional.of("1");
    val intOptInferredLambda = strOpt.map(str -> Integer.valueOf(str));
    val intOptInferredMethodRef = strOpt.map(Integer::valueOf);
    Optional<Integer> intOptExplicit = intOptInferredMethodRef;
    intOptExplicit = intOptInferredLambda;

    System.out.println("\n\nThe app built successfully and ran, showing that the compile error was only in idea, not in the code itself or lombok.\n");
  }
}
