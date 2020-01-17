package com.abrab.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    void findGreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceImpl());
        int result = someBusiness.findGreatestFromAllData();

        assertEquals(20, result);
    }
}

class DataServiceImpl implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{20, 19, 2};
    }
}