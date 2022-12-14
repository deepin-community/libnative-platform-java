/*
 * Copyright 2012 Adam Murdoch
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package net.rubygrapefruit.platform.internal;

import net.rubygrapefruit.platform.MemoryInfo;

public class DefaultMemoryInfo implements MemoryInfo {
    private long totalMem;
    private long availableMem;

    public void details(long totalMem, long availableMem) {
        this.totalMem = totalMem;
        this.availableMem = availableMem;
    }

    public long getTotalPhysicalMemory() {
        return totalMem;
    }

    public long getAvailablePhysicalMemory() {
        return availableMem;
    }
}
