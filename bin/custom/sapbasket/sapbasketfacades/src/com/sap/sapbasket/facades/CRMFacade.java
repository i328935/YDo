/*axle*/
package com.sap.sapbasket.facades;

import de.hybris.platform.commercefacades.automation.data.CRMData;
import java.util.List;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


public interface CRMFacade
{
	public List<CRMData> getCRM();
} 
