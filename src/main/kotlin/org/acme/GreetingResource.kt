package org.acme

import kotlinx.serialization.Serializable
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Serializable
data class GreetingDto(val message: String)

//@Serializable
//data class AnotherDto(val anotherMessage: String)

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = GreetingDto("Hello from RESTEasy Reactive")

//    @GET
//    @Path("another")
//    fun hello2() = AnotherDto("message")
}
