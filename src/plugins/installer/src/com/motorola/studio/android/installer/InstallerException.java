/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.motorola.studio.android.installer;

public class InstallerException extends Exception
{

    private static final long serialVersionUID = 3876492546951746125L;

    public InstallerException(Throwable t)
    {
        super(t);
    }

    public InstallerException(String message)
    {
        super(message);
    }

    public InstallerException(String message, Throwable t)
    {
        super(message, t);
    }

}
