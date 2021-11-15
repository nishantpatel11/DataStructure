package com.org.datastructure;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureExample {

    public static void main(String [] args) throws ExecutionException, InterruptedException {

        CompletableFuture v = CompletableFuture.supplyAsync(() ->  "!!! Hello !!!!");
        Future<String> completableFuture =
                CompletableFuture.completedFuture("Hello -1 !!!!!!!!!!!!!!!!");

        CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> {
          int x =6;
            if(x%2 ==0)
                return x*2 + " - hello";
            return  "Hello default value";
        });

        CompletableFuture <String> f1 =  CompletableFuture.supplyAsync(() -> "Hi");

        CompletableFuture <String> com = f1.thenApply(s -> s + " Nishant");
        CompletableFuture <String> com1 = com.thenApply(s -> s + " , How");
        CompletableFuture <String> com2 = com1.thenApply(s -> s + "  are ");
        CompletableFuture <String> com3 = com2.thenApply(s -> s + " you");
        CompletableFuture <String> com4 = com3.thenApply(s -> s + "  Today ");
        CompletableFuture <String> com5 = com4.thenApply(s -> s + " is");
        CompletableFuture <String> com6 = com5.thenApply(s -> s + " Wednesday");

        CompletableFuture<String> f10 = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"));
//        CompletableFuture cf = CompletableFuture.allOf(f1, v);
//
//        CompletableFuture<Void> f2 = com3
//                .thenAccept(s -> System.out.println("Computation returned: " + s));

//        CompletableFuture<String> completableFuture
//                = CompletableFuture.supplyAsync(() -> "Hello");

//        CompletableFuture<Void> f6 = com1.thenRun(() -> System.out.println("Computation finished."));

        CompletableFuture<String> f11
                = CompletableFuture.supplyAsync(() -> "Hello").thenCombine(CompletableFuture.supplyAsync(
                        () -> " World"), (s1, s2) -> s1 + s2);
        CompletableFuture f12 = CompletableFuture.supplyAsync(() -> "Hello")
                .thenAcceptBoth(CompletableFuture.supplyAsync(() -> " World"),
                        (s1, s2) -> System.out.println(s1 + s2));


//        CompletableFuture<Integer> finalResult = compute().thenApply(s-> s + 1);
//        CompletableFuture<Integer> computeAnother(Integer i){
//            return CompletableFuture.supplyAsync(() -> 10 + i);
//        }
//        CompletableFuture<Integer> finalResult = compute().thenCompose(this::computeAnother);





        CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(future1, future2, future3);

//        combinedFuture.get();

        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));

//        System.out.println(combined);

        String name = null;
        CompletableFuture<String> comFuture
                =  CompletableFuture.supplyAsync(() -> {
            if (name == null) {
                throw new RuntimeException("Computation error!");
            }
            return "Hello, " + name;
        }).handle((s, t) -> s != null ? s : "Hello, Stranger!");

//        comFuture.get();

        CompletableFuture<String> complFuture
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<String> fut = complFuture
                .thenApplyAsync(s -> s + " World");
//        fut.get();
//        assertEquals("Hello World", future.get());


//        try {
////           Future <String> f =  new CompleteableFutureExample().calculateAsync();
////           String result = f.get();
////           String result = completableFuture.get();
////           f2.get();
////           f6.get();
////           System.out.println(cf.get());
////           System.out.println(com6.get());
////           System.out.println(com.get());
////           System.out.println(future.get());
////           System.out.println(result);
////           System.out.println(v.get());
//             f10.get();
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }

    }



    public String getMessage(String message){
        try {
            new StackOverflowError("");
            return "hello";
        } finally {
            System.out.println("Hello");
            return "hello";
        }

    }

    public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }

}
