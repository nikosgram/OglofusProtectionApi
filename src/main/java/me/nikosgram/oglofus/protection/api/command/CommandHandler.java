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

package me.nikosgram.oglofus.protection.api.command;

public @interface CommandHandler
{
    String value();

    String description() default ""; // if empty getting auto from language file. value + "CommandDescription";

    String usage() default "";

    String permission() default ""; // if empty getting auto a new permission. "oglofus.command." + value;

    /**
     * The minimum number of arguments. This should be 0 or above.
     *
     * @return the minimum number of arguments
     */
    int min() default 0;

    /**
     * The maximum number of arguments. Use -1 for an unlimited number
     * of arguments.
     *
     * @return the maximum number of arguments
     */
    int max() default -1;

    boolean console() default true;
}
