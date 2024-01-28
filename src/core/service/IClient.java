package core.service;

public interface IClient {

    void run();


    void scenario1(String item, int qty, String address, String account );

    void scenario2(String[] items, int[] qties, String address, String account ) ;
}

