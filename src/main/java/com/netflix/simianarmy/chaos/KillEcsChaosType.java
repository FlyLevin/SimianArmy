/*
 *
 *  Copyright 2013 Justin Santa Barbara.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.simianarmy.chaos;

import com.netflix.simianarmy.MonkeyConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Executes a disk I/O intensive program on the node, reducing I/O capacity.
 *
 * This simulates either a noisy neighbor on the box or just a general issue with the disk.
 */
public class KillEcsChaosType extends ScriptChaosType {
    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(KillEcsChaosType.class);

    /**
     * Constructor.
     *
     * @param config
     *            Configuration to use
     */
    public KillEcsChaosType(MonkeyConfiguration config) {
        super(config, "KillEcs");
    }

    @Override
    public boolean canApply(ChaosInstance instance) {
        if (!super.canApply(instance)) {
            return false;
        }
        return true;
    }
}
