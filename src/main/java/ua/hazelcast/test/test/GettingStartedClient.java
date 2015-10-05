package ua.hazelcast.test.test;


import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

/**
 * Created by Misha on 05.10.2015.
 */
public class GettingStartedClient {
    public static void main( String[] args ) {

        ClientConfig clientConfig = new ClientConfig();
        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap map = client.getMap( "stock" );
        System.out.println( "Map Size:" + map.size() );
    }
}
