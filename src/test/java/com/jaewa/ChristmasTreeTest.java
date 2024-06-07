package com.jaewa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChristmasTreeTest {

	@Test
	public void christmasTreeDecoratorTest1() {
		ChristmasTree tree = new ChristmasTreeImplemented();
		assertEquals("Albero di Natale", tree.decorate());
	}

	@Test
	public void christmasTreeDecoratorTest2() {
		ChristmasTree tree = new Garland(new ChristmasTreeImplemented());
		assertEquals("Albero di Natale con la ghirlanda", tree.decorate());
	}

	@Test
	public void christmasTreeDecoratorTest3() {
		ChristmasTree tree = new BubbleLights(new Garland(new ChristmasTreeImplemented()));
		assertEquals("Albero di Natale con la ghirlanda con le luci", tree.decorate());
	}
}
