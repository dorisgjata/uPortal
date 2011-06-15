/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal.layout.dlm;

import java.util.List;


/**
 * @version $Revision$ $Date$
 * @since uPortal 2.5
 */
public interface ConfigurationLoader {
    
    /**
     * @return The available fragment definitions
     */
    public List<FragmentDefinition> getFragments();
    
    /**
     * @return A {@link FragmentDefinition} for the specified owner.
     */
    public FragmentDefinition getFragmentByName(String ownerId);
    
    /**
     * @return The DLM configuration property
     */
    public String getProperty(String propertyName);

    /**
     * @return The number of properties
     */
    public int getPropertyCount();
}