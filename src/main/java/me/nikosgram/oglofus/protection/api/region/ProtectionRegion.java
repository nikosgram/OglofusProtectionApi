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

import java.util.UUID;

public interface ProtectionRegion
{
    /**
     * Get the region's name.
     *
     * @return the name.
     */
    String getName();

    /**
     * Get the id from the ProtectionArea.
     *
     * @return the id
     */
    UUID getUuid();

    /**
     * Get the region's location.
     *
     * @return the location {@link ProtectionLocation}.
     */
    ProtectionLocation getLocation();

    /**
     * Get the region's staff.
     *
     * @return the staff {@link ProtectionStaff}.
     */
    ProtectionStaff getProtectionStaff();

    /**
     * Change the region's name.
     *
     * @param name the new name.
     */
    void changeName( String name );
}
