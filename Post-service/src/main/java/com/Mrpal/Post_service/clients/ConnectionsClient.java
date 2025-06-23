package com.Mrpal.Post_service.clients;


import com.Mrpal.Post_service.dto.PersonDto;
import org.bouncycastle.asn1.x509.sigi.PersonalData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "connections-service",path = "/connections")
public interface ConnectionsClient {

    @GetMapping("/core/first-degree")
    List<PersonDto> getFirstConnection();

}
