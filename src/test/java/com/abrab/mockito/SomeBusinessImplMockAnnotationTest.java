package com.abrab.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockAnnotationTest {

    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    void findGreatestFromAllData() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{24, 12, 23});
        assertEquals(24, someBusiness.findGreatestFromAllData());
    }

    @Test
    void findGreatestFromAllDataForOneValue() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{12});
        assertEquals(12, someBusiness.findGreatestFromAllData());
    }
}
