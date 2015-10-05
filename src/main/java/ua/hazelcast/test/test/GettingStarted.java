package ua.hazelcast.test.test;

import com.hazelcast.config.Config;
import com.hazelcast.config.QueueConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Queue;

/**
 * Created by Misha on 05.10.2015.
 */
public class GettingStarted {



        public static void main(String[] args) {
            Config cfg = new Config();

            HazelcastInstance instance = Hazelcast.newHazelcastInstance(cfg);
            Map<Integer, String> mapCustomers = instance.getMap("stock");
            mapCustomers.put(1, "Joe");
            mapCustomers.put(2, "Ali");
            mapCustomers.put(3, "Avi");

            System.out.println("Customer with key 1: "+ mapCustomers.get(1));
            System.out.println("Map Size:" + mapCustomers.size());

            Queue<String> queueCustomers = instance.getQueue("stock");
            queueCustomers.offer("Tom");
            queueCustomers.offer("Mary");
            queueCustomers.offer("Jane");
            System.out.println("First customer: " + queueCustomers.poll());
            System.out.println("Second customer: "+ queueCustomers.peek());
            System.out.println("Queue size: " + queueCustomers.size());
        }

}
