package com.lms.BI.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lms.BI.Pojo.EmailSender;

@FeignClient(url = "https://ctslms01.azurewebsites.net/", name = "confirmationToken")
public interface FeignEmailSender {

	@PostMapping("send/confirmationMail")
	public ResponseEntity<?> sendMail(@RequestBody EmailSender emailSender);
}
