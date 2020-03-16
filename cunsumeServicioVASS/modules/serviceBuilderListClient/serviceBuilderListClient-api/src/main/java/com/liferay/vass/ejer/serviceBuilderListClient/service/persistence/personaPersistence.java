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

package com.liferay.vass.ejer.serviceBuilderListClient.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.vass.ejer.serviceBuilderListClient.exception.NoSuchpersonaException;
import com.liferay.vass.ejer.serviceBuilderListClient.model.persona;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the persona service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see personaUtil
 * @generated
 */
@ProviderType
public interface personaPersistence extends BasePersistence<persona> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link personaUtil} to access the persona persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the personas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching personas
	 */
	public java.util.List<persona> findByUuid(String uuid);

	/**
	 * Returns a range of all the personas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @return the range of matching personas
	 */
	public java.util.List<persona> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the personas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personas
	 */
	public java.util.List<persona> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<persona>
			orderByComparator);

	/**
	 * Returns an ordered range of all the personas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching personas
	 */
	public java.util.List<persona> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<persona>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first persona in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persona
	 * @throws NoSuchpersonaException if a matching persona could not be found
	 */
	public persona findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<persona>
				orderByComparator)
		throws NoSuchpersonaException;

	/**
	 * Returns the first persona in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persona, or <code>null</code> if a matching persona could not be found
	 */
	public persona fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<persona>
			orderByComparator);

	/**
	 * Returns the last persona in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persona
	 * @throws NoSuchpersonaException if a matching persona could not be found
	 */
	public persona findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<persona>
				orderByComparator)
		throws NoSuchpersonaException;

	/**
	 * Returns the last persona in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persona, or <code>null</code> if a matching persona could not be found
	 */
	public persona fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<persona>
			orderByComparator);

	/**
	 * Returns the personas before and after the current persona in the ordered set where uuid = &#63;.
	 *
	 * @param customerId the primary key of the current persona
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persona
	 * @throws NoSuchpersonaException if a persona with the primary key could not be found
	 */
	public persona[] findByUuid_PrevAndNext(
			int customerId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<persona>
				orderByComparator)
		throws NoSuchpersonaException;

	/**
	 * Removes all the personas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of personas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching personas
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the persona in the entity cache if it is enabled.
	 *
	 * @param persona the persona
	 */
	public void cacheResult(persona persona);

	/**
	 * Caches the personas in the entity cache if it is enabled.
	 *
	 * @param personas the personas
	 */
	public void cacheResult(java.util.List<persona> personas);

	/**
	 * Creates a new persona with the primary key. Does not add the persona to the database.
	 *
	 * @param customerId the primary key for the new persona
	 * @return the new persona
	 */
	public persona create(int customerId);

	/**
	 * Removes the persona with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customerId the primary key of the persona
	 * @return the persona that was removed
	 * @throws NoSuchpersonaException if a persona with the primary key could not be found
	 */
	public persona remove(int customerId) throws NoSuchpersonaException;

	public persona updateImpl(persona persona);

	/**
	 * Returns the persona with the primary key or throws a <code>NoSuchpersonaException</code> if it could not be found.
	 *
	 * @param customerId the primary key of the persona
	 * @return the persona
	 * @throws NoSuchpersonaException if a persona with the primary key could not be found
	 */
	public persona findByPrimaryKey(int customerId)
		throws NoSuchpersonaException;

	/**
	 * Returns the persona with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param customerId the primary key of the persona
	 * @return the persona, or <code>null</code> if a persona with the primary key could not be found
	 */
	public persona fetchByPrimaryKey(int customerId);

	/**
	 * Returns all the personas.
	 *
	 * @return the personas
	 */
	public java.util.List<persona> findAll();

	/**
	 * Returns a range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @return the range of personas
	 */
	public java.util.List<persona> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of personas
	 */
	public java.util.List<persona> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<persona>
			orderByComparator);

	/**
	 * Returns an ordered range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>personaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of personas
	 */
	public java.util.List<persona> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<persona>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the personas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of personas.
	 *
	 * @return the number of personas
	 */
	public int countAll();

}