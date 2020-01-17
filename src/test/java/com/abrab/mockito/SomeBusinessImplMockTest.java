package com.abrab.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {

    @Test
    void findGreatestFromAllData() {
        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[]{24, 12, 23});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        int result = someBusiness.findGreatestFromAllData();

        assertEquals(24, result);
    }

    @Test
    void findGreatestFromAllDataForOneValue() {
        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[]{12});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        int result = someBusiness.findGreatestFromAllData();

        assertEquals(12, result);
    }
}
