/*
 * Copyright 2009 Sun Microsystems, Inc.
 * All rights reserved.  You may not modify, use,
 * reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://developer.sun.com/berkeley_license.html
 */


package simpleclient;

import helloservice.endpoint.HelloService;
import helloservice.endpoint.Hello;


public class HelloClient {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            HelloClient client = new HelloClient();
            client.doTest( "kittie" );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void doTest(String name) {
        try { // Call Web Service Operation

            HelloService service = new HelloService();
            System.out.println(
                    "Retrieving the port from the following service: "
                    + service);

            Hello port = service.getHelloPort();

            System.out.println("Invoking the sayHello operation on the port.");

            name = (name == null || name.equals(""))? "No name" : name;

            String response = port.sayHello(name);
            System.out.println(response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
