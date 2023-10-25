import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests
{
    @Test
    public void filterTest()
    {
        List<String> inputList = new ArrayList<String>();
        inputList.add("a");
        inputList.add("ab");
        inputList.add("b");
        inputList.add("ba");
        
        List<String> validList = new ArrayList<String>();
        validList.add("ab");
        validList.add("ba");

        StringChecker stringChecker = new StringChecker1();

        assertEquals(validList, ListExamples.filter(inputList, stringChecker));
    }
    
    @Test
    public void mergeTest()
    {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1.add("a");
        list2.add("b");
        list1.add("c");
        list2.add("d");
        list1.add("e");
        list2.add("f");

        List<String> valid = new ArrayList<String>();
        valid.add("a");
        valid.add("b");
        valid.add("c");
        valid.add("d");
        valid.add("e");
        valid.add("f");

        assertEquals(valid, ListExamples.merge(list1, list2));
    }
}