package com.mt;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

public class SchemaResolver implements CurrentTenantIdentifierResolver {
 
	@Override
	public String resolveCurrentTenantIdentifier() {
		return "sampleschema1"; //TODO: Implement service to identify tenant like: userService.getCurrentlyAuthUser().getTenantId();
	}
 
	@Override
	public boolean validateExistingCurrentSessions() {
		return false;
	}
}