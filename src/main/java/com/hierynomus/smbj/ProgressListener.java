/*
 * Copyright (C)2016 - SMBJ Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hierynomus.smbj;

/**
 * Created by saravanan on 5/9/16.
 */
public interface ProgressListener {

    /**
     * Invoked when the progress of the API call changes.
     * @param numBytes   the number of bytes completed.
     * @param totalBytes the total number of bytes.
     */
    void onProgressChanged(long numBytes, long totalBytes);
}