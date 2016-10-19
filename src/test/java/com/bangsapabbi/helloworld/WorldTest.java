package com.bangsapabbi.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WorldTest {

    @Test
    public void greetResultsInHello() {
        World world = new World();
        assertEquals("Hello world!", world.greet()); }

	@Test
	public void greetResultsInHello2() {
        	World world = new World();
        assertEquals("Hello worl!", world.greet()); }


}
