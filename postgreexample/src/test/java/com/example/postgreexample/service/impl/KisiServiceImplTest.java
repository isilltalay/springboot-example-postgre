package com.example.postgreexample.service.impl;

import com.example.postgreexample.Kisi;
import com.example.postgreexample.dto.KisiDto;
import com.example.postgreexample.repo.AddressRepository;
import com.example.postgreexample.repo.KisiRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class KisiServiceImplTest {
    @InjectMocks
    private KisiServiceImpl kisiService;
    @Mock
    private KisiRepository kisiRepository;
    @Mock
    private AddressRepository addressRepository;

    @Test
    public void testSave(){
        KisiDto kisiDto = new KisiDto();
        kisiDto.setAdi("Test-Name");
        kisiDto.setSoyadi("Test-LastName");
        kisiDto.setAdresler(Arrays.asList(""));
        Kisi kisiMock = mock(Kisi.class);

        Mockito.when(kisiMock.getId()).thenReturn(1L);
        when(kisiRepository.save(ArgumentMatchers.any(Kisi.class))).thenReturn(kisiMock);

        KisiDto result = kisiService.save(kisiDto);
        assertEquals(result.getAdi(),kisiDto.getAdi());
        assertEquals(result.getId(),1L);

    }
}