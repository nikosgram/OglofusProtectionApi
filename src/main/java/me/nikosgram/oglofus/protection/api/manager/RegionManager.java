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

package me.nikosgram.oglofus.protection.api.manager;

import me.nikosgram.oglofus.protection.api.action.ActionResponse;
import me.nikosgram.oglofus.protection.api.region.ProtectionLocation;
import me.nikosgram.oglofus.protection.api.region.ProtectionRegion;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface RegionManager
{
    Optional< ProtectionRegion > getRegion( UUID target );

    Optional< ProtectionRegion > getRegion( String target );

    Optional< ProtectionRegion > getRegion( ProtectionLocation location );

    Collection< ProtectionRegion > getRegions();

    ActionResponse createProtectionArea( ProtectionLocation location, UUID owner );

    ActionResponse deleteProtectionArea( ProtectionRegion area, UUID owner );
}
