package org.springboot.demo.client;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springboot.demo.protobuf.demo.HelloReply;
import org.springboot.demo.protobuf.demo.HelloRequest;
import org.springboot.demo.protobuf.demo.MyServiceGrpc;
import org.springframework.stereotype.Service;
import io.grpc.StatusRuntimeException;


@Service
public class GrpcClientService {

    @GrpcClient("demo-grpc-server")
    private MyServiceGrpc.MyServiceBlockingStub myServiceStub;

    public String sendMessage(final String name) {
        try {
            final HelloReply response = this.myServiceStub.sayHello(HelloRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            e.printStackTrace();
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

}
