package com.digdes.java2023.lecture2;

import java.util.*;

public class TryCatchTest {
    public Integer testExc()  {
        try {
            return 42;
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        finally {
            return 24;
        }
    }
}
