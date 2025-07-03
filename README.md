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