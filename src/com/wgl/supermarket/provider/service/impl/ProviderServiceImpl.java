package com.wgl.supermarket.provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Provider;
import com.wgl.supermarket.provider.dao.ProviderDao;
import com.wgl.supermarket.provider.service.ProviderService;

@Service("providerService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ProviderServiceImpl implements ProviderService {
	@Autowired
	private ProviderDao providerDao;
	@Override
	public void saveProvider(Provider provider) {
		this.providerDao.save(provider);
	}

}
