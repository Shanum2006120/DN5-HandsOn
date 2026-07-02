package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class VerifyInteractionTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Create service using mock
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify interaction
        verify(mockApi).getData();
    }
}