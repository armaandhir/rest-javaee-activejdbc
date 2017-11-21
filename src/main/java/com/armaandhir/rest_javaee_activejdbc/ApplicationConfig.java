package com.armaandhir.rest_javaee_activejdbc;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Some more information about EJB and REST can be viewed here:
 *      https://dzone.com/articles/how-to-combine-rest-and-ejb-31
 */

/**
 * @ApplicationPath provides an alternative to web.xml configuration.
 * The string value represents the root folder for all endpoints.
 */
@ApplicationPath("api")
public class ApplicationConfig extends Application
{

}
