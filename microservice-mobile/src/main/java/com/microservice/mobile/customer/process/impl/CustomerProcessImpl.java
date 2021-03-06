package com.microservice.mobile.customer.process.impl;

import com.microservice.mobile.customer.pojo.vo.resp.RespCustomerReceiptVo;
import com.microservice.mobile.customer.process.CustomerProcess;
import com.microservice.mobile.customer.service.CustomerReceiptService;
import com.microservice.mobile.customer.service.CustomerService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author MinWeikai
 * @date 2019/11/6 10:38
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerProcessImpl implements CustomerProcess {

	@NonNull
	private CustomerReceiptService customerReceiptService;

	@NonNull
	private CustomerService customerService;

	@Override
	public RespCustomerReceiptVo receiptInfo(Integer customerId) {
		return customerReceiptService.receiptInfo(customerId);
	}

}
