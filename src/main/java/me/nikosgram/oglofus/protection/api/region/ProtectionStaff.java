/*
 * Copyright 2014-2015 Nikos Grammatikos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://raw.githubusercontent.com/nikosgram13/OglofusProtection/master/LICENSE
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.nikosgram.oglofus.protection.api.region;

import me.nikosgram.oglofus.protection.api.action.ActionResponse;

import java.util.Collection;
import java.util.UUID;

public interface ProtectionStaff
{
    /**
     * Get the owners.
     *
     * @return the owners.
     */
    < T > Collection< T > getOwners( Class< T > tClass );

    /**
     * Get the owners ids.
     *
     * @return owners as {@link UUID}.
     */
    Collection< UUID > getOwnersUuid();

    /**
     * Get the members.
     *
     * @return the members.
     */
    < T > Collection< T > getMembers( Class< T > tClass );

    /**
     * Get the members ids.
     *
     * @return the members as {@link UUID}.
     */
    Collection< UUID > getMembersUuid();

    /**
     * Get the staff.
     *
     * @return the staff.
     */
    < T > Collection< T > getStaff( Class< T > tClass );

    /**
     * Get the staff ids.
     *
     * @return staff as {@link UUID}.
     */
    Collection< UUID > getStaffUuid();

    /**
     * Check if a player is owner.
     *
     * @param target the {@link UUID}
     * @return true if the player is owner
     */
    boolean isOwner( UUID target );

    /**
     * Check if a player is owner.
     *
     * @param target the {@link UUID}
     * @return true if the player is owner
     */
    boolean isMember( UUID target );

    /**
     * Check if a player is staff.
     *
     * @param target the {@link UUID}
     * @return true if the player is staff
     */
    boolean isStaff( UUID target );

    /**
     * Check if a player has owner access.
     *
     * @param target the {@link UUID}
     * @return true if the player has owner access
     */
    boolean hasOwnerAccess( UUID target );

    /**
     * Check if a player has member access.
     *
     * @param target the {@link UUID}
     * @return true if the player has member access
     */
    boolean hasMemberAccess( UUID target );

    /**
     * Get the rank from player
     *
     * @param target the {@link UUID}
     * @return the rank
     */
    ProtectionRank getRank( UUID target );

    /**
     * Broadcast, to protection area's members, a message
     *
     * @param message the message
     */
    void broadcast( String message );

    /**
     * Broadcast, to protection area's members with rank, a message
     *
     * @param message the message
     * @param rank    who you want to display the message
     */
    void broadcast( String message, ProtectionRank rank );

    /**
     * Reflag this region.
     *
     * @return the response.
     */
    ActionResponse reFlag();

    /**
     * Invite a player to join at this area
     *
     * @param sender who want to invite the player
     * @param target the player
     * @return the response.
     */
    ActionResponse invite( Object sender, UUID target );

    /**
     * Invite a player to join at this area
     *
     * @param target the player
     * @return the response.
     */
    ActionResponse invite( UUID target );

    /**
     * Kick a player to join at this area
     *
     * @param sender who want to kick the player
     * @param target the player
     * @return the response.
     */
    ActionResponse kick( Object sender, UUID target );

    /**
     * Kick a player to join at this area
     *
     * @param target the player
     * @return the response.
     */
    ActionResponse kick( UUID target );
}
