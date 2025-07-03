# String Calculator TDD 

## test 1 : empty string return 0

In this test code will return the 0 if the input is empty.First I create a test case and then test the code. It is very obvious that the code might fail , and yes it fails then I add the correct pass of it and test it.It will pass the test case.

test1
```java
 @Test
    public void testEmptyString(){
        assertEquals(0,new Calculator().addition(""));
    }
```

## test 2 : single number return it self

Now I have created a test case where if the input is the any single number (0-9) then I want the output as number itself. Fisrt create a test case which not pass by my code of calculator , then I update it and it will work for it now.

test2
```java
@Test
    public void testSingleNumberString(){
        assertEquals(9,new Calculator().addition("9"));
        assertEquals(4,new Calculator().addition("4"));
    }
```

## test 3 : sum of two passed number 

I have created a test case for adding 2 numbers which is comma seperated and the calculator will return the sum of this two numbers.

```java
 @Test
    public void testDoubleNumbersString(){
        assertEquals(9,new Calculator().addition("4,5"));
        assertEquals(4,new Calculator().addition("1,3"));
    }
```

## test 4 : sum the multiple numbers comma separated

above given code is also work for this test case , In above one only 2 numbers are there now the numbers are increased but the logically code is correct for this also.

```java
@Test
    public void testMultipleNumbersString(){
        assertEquals(17,new Calculator().addition("4,5,7,1"));
        assertEquals(6,new Calculator().addition("1,3,0,2"));
        assertEquals(11,new Calculator().addition("11,,"));
    }
```

## test 5 : sum the numbers which are separate with new line also

I have design test case which have new line separated numbers pass as String for addition.

```java
@Test
public void testNewLineNumberString(){
    assertEquals(7,new Calculator().addition("4\n2,1"));
    assertEquals(15,new Calculator().addition("11\n4"));
}
```
