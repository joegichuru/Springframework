package com.joseph;

/**
 * Created by joseph on 6/29/17.
 */
public class ClientService {
    private static ClientService clientService=new ClientService();
    private ClientService(){}
    public static ClientService createInstance(){
        return clientService;
    }
}
