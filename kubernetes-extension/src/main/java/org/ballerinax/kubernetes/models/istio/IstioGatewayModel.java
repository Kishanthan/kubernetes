/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.ballerinax.kubernetes.models.istio;

import org.ballerinax.kubernetes.models.KubernetesModel;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 */
public class IstioGatewayModel extends KubernetesModel {
    
    private String namespace;
    private Map<String, String> labels;
    private Map<String, String> annotations;
    private Map<String, String> selector;
    private List<IstioServerModel> servers;
    
    public String getNamespace() {
        return namespace;
    }
    
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    public Map<String, String> getLabels() {
        return labels;
    }
    
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }
    
    public Map<String, String> getAnnotations() {
        return annotations;
    }
    
    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }
    
    public Map<String, String> getSelector() {
        return selector;
    }
    
    public void setSelector(Map<String, String> selector) {
        this.selector = selector;
    }
    
    public List<IstioServerModel> getServers() {
        return servers;
    }
    
    public void setServers(List<IstioServerModel> servers) {
        this.servers = servers;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IstioGatewayModel)) {
            return false;
        }
        IstioGatewayModel that = (IstioGatewayModel) o;
        return this.getName().equals(that.getName());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
    
//    public Represent getYamlRepresenter() {
//        return o -> {
//            IstioGatewayModel gatewayModel = (IstioGatewayModel) o;
//
//            return new ScalarNode()
//        };
//    }
}
