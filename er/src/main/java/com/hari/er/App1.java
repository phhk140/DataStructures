package com.hari.er;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

/*@Service*/
@Path("/demo")
public class App1 {
	@GET
	@Path("/serv/{name}")
	@Produces("text/plain")
	public String testService(@PathParam("name") String value) {
		// return "Hello" + name;
		Integer i, j;
		int value1 = Integer.parseInt(value);
		for (j = value1 + 1;; j++) {
			for (i = 2; i < j; i++) {
				if (j % i == 0)
					break;
			}
			if (i == j) {
				// System.out.println("next prime:" + j);
				break;
			}

		}
		return Integer.toString(j);
	}

}
