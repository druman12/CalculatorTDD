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
