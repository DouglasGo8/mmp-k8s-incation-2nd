package com.manning.k8s.api.mediation;


import lombok.NoArgsConstructor;
import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@NoArgsConstructor
@ApplicationScoped
public class KubernetesApiIntegrationRoute extends RouteBuilder {

  @Override
  public void configure()  {

    from("timer://myTimer?period=10s&fixedRate=true")
            .to("vertx-http:http://127.0.0.1:8001/api/v1/nodes/localhost")
            .log("${body}");
  }
}
