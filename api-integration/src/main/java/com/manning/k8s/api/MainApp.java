package com.manning.k8s.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.apache.camel.quarkus.main.CamelMainApplication;

@QuarkusMain
public class MainApp {
  public static void main(String... args) {
    Quarkus.run(CamelMainApplication.class, args);
  }
}
