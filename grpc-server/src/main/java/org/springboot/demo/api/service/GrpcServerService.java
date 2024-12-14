package org.springboot.demo.api.service;
import io.grpc.stub.StreamObserver;

import net.devh.boot.grpc.server.service.GrpcService;

import org.springboot.demo.protobuf.demo.HelloReply;
import org.springboot.demo.protobuf.demo.HelloRequest;
import org.springboot.demo.protobuf.demo.MyServiceGrpc;

/**
 * @author xueping
 * @since 2016/11/8
 */

@GrpcService
public class GrpcServerService extends MyServiceGrpc.MyServiceImplBase {

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello ==> " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
