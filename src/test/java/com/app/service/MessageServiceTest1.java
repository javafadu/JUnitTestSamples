package com.app.service;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

// Unit test sadece birimi test eder, o nedenle bagimliliklarin izole edilmesi gerekiyor
// Boylece bagimliliklarin yan etkilerinin onlenmesi saglanir
// Gercek objeler beklenmedik durumlara neden olabilir
// Gercek objeler yavas calisabilir ve zor bir sekilde yapilandirilir.
// Gercek objeler tekrar edilebilir olmayabilir
// JAVA da mocking islemlerini yapabilmek icin Mackito, JMockit ve EasyMock kullanilabilir

// Mockito kullanmak icin

public class MessageServiceTest1 {
    @Test
    void addMessageTest() {
        MessageService service = mock(MessageService.class);
        service.addMessage("Merhaba");
        service.addMessage("Mockito");

        verify(service).addMessage("Mockito");
    }


    @Test
    void howManyCallTest() {
        MessageService service = mock(MessageService.class);
        service.addMessage("Merhaba");
        service.addMessage("Merhaba");
        service.addMessage("Mockito");


        // verify(service,times(2)).addMessage("Merhaba");

        // verify(service,never()).removeMessage(any());

        verify(service,atLeast(2)).addMessage("Merhaba");
    }


    @Test
    void callOrderTest() {
        MessageService service = mock(MessageService.class);
        service.addMessage("Merhaba");
        service.addMessage("Mockito");

        InOrder inOrder = inOrder(service);
        inOrder.verify(service).addMessage("Merhaba");
        inOrder.verify(service).addMessage("Mockito");
    }


}
