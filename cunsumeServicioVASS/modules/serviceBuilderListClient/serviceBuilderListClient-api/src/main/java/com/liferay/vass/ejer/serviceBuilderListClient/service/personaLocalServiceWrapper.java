/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.vass.ejer.serviceBuilderListClient.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link personaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see personaLocalService
 * @generated
 */
@ProviderType
public class personaLocalServiceWrapper
	implements personaLocalService, ServiceWrapper<personaLocalService> {

	public personaLocalServiceWrapper(personaLocalService personaLocalService) {
		_personaLocalService = personaLocalService;
	}

	/**
	 * Adds the persona to the database. Also notifies the appropriate model listeners.
	 *
	 * @param persona the persona
	 * @return the persona that was added
	 */
	@Override
	public com.liferay.vass.ejer.serviceBuilderListClient.model.persona
		addpersona(
			com.liferay.vass.ejer.serviceBuilderListClient.model.persona
				persona) {

		return _personaLocalService.addpersona(persona);
	}

	/**
	 * Creates a new persona with the primary key. Does not add the persona to the database.
	 *
	 * @param customerId the primary key for the new persona
	 * @return the new persona
	 */
	@Override
	public com.liferay.vass.ejer.serviceBuilderListClient.model.persona
		createpersona(int customerId) {

		return _personaLocalService.createpersona(customerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the persona with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customerId the primary key of the persona
	 * @return the persona that was removed
	 * @throws PortalException if a persona with the primary key could not be found
	 */
	@Override
	public com.liferay.vass.ejer.serviceBuilderListClient.model.persona
			deletepersona(int customerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personaLocalService.deletepersona(customerId);
	}

	/**
	 * Deletes the persona from the database. Also notifies the appropriate model listeners.
	 *
	 * @param persona the persona
	 * @return the persona that was removed
	 */
	@Override
	public com.liferay.vass.ejer.serviceBuilderListClient.model.persona
		deletepersona(
			com.liferay.vass.ejer.serviceBuilderListClient.model.persona
				persona) {

		return _personaLocalService.deletepersona(persona);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _personaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _personaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.vass.ejer.serviceBuilderListClient.model.impl.personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _personaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.vass.ejer.serviceBuilderListClient.model.impl.personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _personaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _personaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _personaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.vass.ejer.serviceBuilderListClient.model.persona
		fetchpersona(int customerId) {

		return _personaLocalService.fetchpersona(customerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _personaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _personaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _personaLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the persona with the primary key.
	 *
	 * @param customerId the primary key of the persona
	 * @return the persona
	 * @throws PortalException if a persona with the primary key could not be found
	 */
	@Override
	public com.liferay.vass.ejer.serviceBuilderListClient.model.persona
			getpersona(int customerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personaLocalService.getpersona(customerId);
	}

	/**
	 * Returns a range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.vass.ejer.serviceBuilderListClient.model.impl.personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @return the range of personas
	 */
	@Override
	public java.util.List
		<com.liferay.vass.ejer.serviceBuilderListClient.model.persona>
			getpersonas(int start, int end) {

		return _personaLocalService.getpersonas(start, end);
	}

	/**
	 * Returns the number of personas.
	 *
	 * @return the number of personas
	 */
	@Override
	public int getpersonasCount() {
		return _personaLocalService.getpersonasCount();
	}

	/**
	 * Updates the persona in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param persona the persona
	 * @return the persona that was updated
	 */
	@Override
	public com.liferay.vass.ejer.serviceBuilderListClient.model.persona
		updatepersona(
			com.liferay.vass.ejer.serviceBuilderListClient.model.persona
				persona) {

		return _personaLocalService.updatepersona(persona);
	}

	@Override
	public personaLocalService getWrappedService() {
		return _personaLocalService;
	}

	@Override
	public void setWrappedService(personaLocalService personaLocalService) {
		_personaLocalService = personaLocalService;
	}

	private personaLocalService _personaLocalService;

}