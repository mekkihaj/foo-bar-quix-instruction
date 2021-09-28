package com.kata.foobarquix.services

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired

@SpringBootTest
class FooBarQuixApplicationTests {

	@Autowired
    private lateinit var fooBarQuixService: FooBarQuixService;
    
    @Test
    fun convertNumber() {
		assertEquals("Buzz", fooBarQuixService.convertNumber(0));
        assertEquals("1", fooBarQuixService.convertNumber(1));
        assertEquals("FooFoo", fooBarQuixService.convertNumber(3));
        assertEquals("BarBar", fooBarQuixService.convertNumber(5));
        assertEquals("QuixQuix", fooBarQuixService.convertNumber(7));
        assertEquals("Foo", fooBarQuixService.convertNumber(9));
        assertEquals("FooBar", fooBarQuixService.convertNumber(51));
        assertEquals("BarFoo", fooBarQuixService.convertNumber(53));
        assertEquals("FooFooFoo", fooBarQuixService.convertNumber(33));
        assertEquals("FooQuix", fooBarQuixService.convertNumber(27));
        assertEquals("FooBarBar", fooBarQuixService.convertNumber(15));
    }

}
