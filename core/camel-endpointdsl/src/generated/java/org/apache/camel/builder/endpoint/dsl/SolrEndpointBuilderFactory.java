/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations against Apache Lucene Solr.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SolrEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Solr component.
     */
    public interface SolrEndpointBuilder extends EndpointProducerBuilder {
        /**
         * If true, each producer operation will be automatically followed by a
         * commit.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param autoCommit the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder autoCommit(boolean autoCommit) {
            doSetProperty("autoCommit", autoCommit);
            return this;
        }
        /**
         * If true, each producer operation will be automatically followed by a
         * commit.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param autoCommit the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder autoCommit(String autoCommit) {
            doSetProperty("autoCommit", autoCommit);
            return this;
        }
        /**
         * Sets the connection timeout on the SolrClient.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder connectionTimeout(Integer connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Sets the connection timeout on the SolrClient.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder connectionTimeout(String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * maxConnectionsPerHost on the underlying HttpConnectionManager.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param defaultMaxConnectionsPerHost the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SolrEndpointBuilder defaultMaxConnectionsPerHost(
                Integer defaultMaxConnectionsPerHost) {
            doSetProperty("defaultMaxConnectionsPerHost", defaultMaxConnectionsPerHost);
            return this;
        }
        /**
         * maxConnectionsPerHost on the underlying HttpConnectionManager.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param defaultMaxConnectionsPerHost the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SolrEndpointBuilder defaultMaxConnectionsPerHost(
                String defaultMaxConnectionsPerHost) {
            doSetProperty("defaultMaxConnectionsPerHost", defaultMaxConnectionsPerHost);
            return this;
        }
        /**
         * Sets the http client to be used by the solrClient.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.http.client.HttpClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param httpClient the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder httpClient(Object httpClient) {
            doSetProperty("httpClient", httpClient);
            return this;
        }
        /**
         * Sets the http client to be used by the solrClient.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.http.client.HttpClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param httpClient the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder httpClient(String httpClient) {
            doSetProperty("httpClient", httpClient);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Maximum number of retries to attempt in the event of transient
         * errors.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param maxRetries the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SolrEndpointBuilder maxRetries(Integer maxRetries) {
            doSetProperty("maxRetries", maxRetries);
            return this;
        }
        /**
         * Maximum number of retries to attempt in the event of transient
         * errors.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param maxRetries the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SolrEndpointBuilder maxRetries(String maxRetries) {
            doSetProperty("maxRetries", maxRetries);
            return this;
        }
        /**
         * maxTotalConnection on the underlying HttpConnectionManager.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param maxTotalConnections the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SolrEndpointBuilder maxTotalConnections(
                Integer maxTotalConnections) {
            doSetProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * maxTotalConnection on the underlying HttpConnectionManager.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param maxTotalConnections the value to set
         * @return the dsl builder
         */
        @Deprecated
        default SolrEndpointBuilder maxTotalConnections(
                String maxTotalConnections) {
            doSetProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * Set the request handler to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param requestHandler the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder requestHandler(String requestHandler) {
            doSetProperty("requestHandler", requestHandler);
            return this;
        }
        /**
         * Uses the provided solr client to connect to solr. When this parameter
         * is not specified, camel applies the following rules to determine the
         * SolrClient. A CloudSolrClient should point to a zookeeper endpoint.
         * Other clients point to a Solr endpoint. 1) when zkHost or zkChroot
         * (=zookeeper root) parameter is set, then the CloudSolrClient is used.
         * 2) when multiple hosts are specified in the uri (separated with a
         * comma), then the CloudSolrClient (uri scheme is 'solrCloud') or the
         * LBHttpSolrClient (uri scheme is not 'solrCloud') is used. 3) when the
         * solr operation is INSERT_STREAMING, then the
         * ConcurrentUpdateSolrClient is used. 4) otherwise, the HttpSolrClient
         * is used.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.solr.client.solrj.SolrClient&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param solrClient the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder solrClient(Object solrClient) {
            doSetProperty("solrClient", solrClient);
            return this;
        }
        /**
         * Uses the provided solr client to connect to solr. When this parameter
         * is not specified, camel applies the following rules to determine the
         * SolrClient. A CloudSolrClient should point to a zookeeper endpoint.
         * Other clients point to a Solr endpoint. 1) when zkHost or zkChroot
         * (=zookeeper root) parameter is set, then the CloudSolrClient is used.
         * 2) when multiple hosts are specified in the uri (separated with a
         * comma), then the CloudSolrClient (uri scheme is 'solrCloud') or the
         * LBHttpSolrClient (uri scheme is not 'solrCloud') is used. 3) when the
         * solr operation is INSERT_STREAMING, then the
         * ConcurrentUpdateSolrClient is used. 4) otherwise, the HttpSolrClient
         * is used.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.solr.client.solrj.SolrClient&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param solrClient the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder solrClient(String solrClient) {
            doSetProperty("solrClient", solrClient);
            return this;
        }
        /**
         * Sets the socket timeout on the SolrClient.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param soTimeout the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder soTimeout(Integer soTimeout) {
            doSetProperty("soTimeout", soTimeout);
            return this;
        }
        /**
         * Sets the socket timeout on the SolrClient.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param soTimeout the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder soTimeout(String soTimeout) {
            doSetProperty("soTimeout", soTimeout);
            return this;
        }
        /**
         * Sets the queue size for the ConcurrentUpdateSolrClient.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: producer
         * 
         * @param streamingQueueSize the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder streamingQueueSize(int streamingQueueSize) {
            doSetProperty("streamingQueueSize", streamingQueueSize);
            return this;
        }
        /**
         * Sets the queue size for the ConcurrentUpdateSolrClient.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: producer
         * 
         * @param streamingQueueSize the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder streamingQueueSize(String streamingQueueSize) {
            doSetProperty("streamingQueueSize", streamingQueueSize);
            return this;
        }
        /**
         * Sets the number of threads for the ConcurrentUpdateSolrClient.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 2
         * Group: producer
         * 
         * @param streamingThreadCount the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder streamingThreadCount(
                int streamingThreadCount) {
            doSetProperty("streamingThreadCount", streamingThreadCount);
            return this;
        }
        /**
         * Sets the number of threads for the ConcurrentUpdateSolrClient.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 2
         * Group: producer
         * 
         * @param streamingThreadCount the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder streamingThreadCount(
                String streamingThreadCount) {
            doSetProperty("streamingThreadCount", streamingThreadCount);
            return this;
        }
        /**
         * Set the default collection for SolrCloud.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: CloudSolrClient
         * 
         * @param collection the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder collection(String collection) {
            doSetProperty("collection", collection);
            return this;
        }
        /**
         * Set the chroot of the zookeeper connection (include the leading
         * slash; e.g. '/mychroot').
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: CloudSolrClient
         * 
         * @param zkChroot the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder zkChroot(String zkChroot) {
            doSetProperty("zkChroot", zkChroot);
            return this;
        }
        /**
         * Set the ZooKeeper host(s) urls which the CloudSolrClient uses, e.g.
         * zkHost=localhost:8123,localhost:8124. Optionally add the chroot, e.g.
         * zkHost=localhost:8123,localhost:8124/rootformysolr. In case the first
         * part of the chroot path in the zkHost parameter is set to 'solr'
         * (e.g. 'localhost:8123/solr' or 'localhost:8123/solr/..'), then that
         * path is not considered as zookeeper chroot for backward compatibility
         * reasons (this behaviour can be overridden via zkChroot parameter).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: CloudSolrClient
         * 
         * @param zkHost the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder zkHost(String zkHost) {
            doSetProperty("zkHost", zkHost);
            return this;
        }
        /**
         * Server side must support gzip or deflate for this to have any effect.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: HttpSolrClient
         * 
         * @param allowCompression the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder allowCompression(Boolean allowCompression) {
            doSetProperty("allowCompression", allowCompression);
            return this;
        }
        /**
         * Server side must support gzip or deflate for this to have any effect.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: HttpSolrClient
         * 
         * @param allowCompression the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder allowCompression(String allowCompression) {
            doSetProperty("allowCompression", allowCompression);
            return this;
        }
        /**
         * Indicates whether redirects are used to get to the Solr server.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: HttpSolrClient
         * 
         * @param followRedirects the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder followRedirects(Boolean followRedirects) {
            doSetProperty("followRedirects", followRedirects);
            return this;
        }
        /**
         * Indicates whether redirects are used to get to the Solr server.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: HttpSolrClient
         * 
         * @param followRedirects the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder followRedirects(String followRedirects) {
            doSetProperty("followRedirects", followRedirects);
            return this;
        }
        /**
         * Sets password for basic auth plugin enabled servers.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Sets username for basic auth plugin enabled servers.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default SolrEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    public interface SolrBuilders {
        /**
         * Solr (camel-solr)
         * Perform operations against Apache Lucene Solr.
         * 
         * Category: monitoring,search
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-solr
         * 
         * Syntax: <code>solr:url</code>
         * 
         * Path parameter: url (required)
         * Hostname and port for the Solr server(s). Multiple hosts can be
         * specified, separated with a comma. See the solrClient parameter for
         * more information on the SolrClient used to connect to Solr.
         * 
         * @param path url
         * @return the dsl builder
         */
        default SolrEndpointBuilder solr(String path) {
            return SolrEndpointBuilderFactory.endpointBuilder("solr", path);
        }
        /**
         * Solr (camel-solr)
         * Perform operations against Apache Lucene Solr.
         * 
         * Category: monitoring,search
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-solr
         * 
         * Syntax: <code>solr:url</code>
         * 
         * Path parameter: url (required)
         * Hostname and port for the Solr server(s). Multiple hosts can be
         * specified, separated with a comma. See the solrClient parameter for
         * more information on the SolrClient used to connect to Solr.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path url
         * @return the dsl builder
         */
        default SolrEndpointBuilder solr(String componentName, String path) {
            return SolrEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
        /**
         * Solr (camel-solr)
         * Perform operations against Apache Lucene Solr.
         * 
         * Category: monitoring,search
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-solr
         * 
         * Syntax: <code>solrCloud:url</code>
         * 
         * Path parameter: url (required)
         * Hostname and port for the Solr server(s). Multiple hosts can be
         * specified, separated with a comma. See the solrClient parameter for
         * more information on the SolrClient used to connect to Solr.
         * 
         * @param path url
         * @return the dsl builder
         */
        default SolrEndpointBuilder solrCloud(String path) {
            return SolrEndpointBuilderFactory.endpointBuilder("solrCloud", path);
        }
        /**
         * Solr (Secure) (camel-solr)
         * Perform operations against Apache Lucene Solr.
         * 
         * Category: monitoring,search
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-solr
         * 
         * Syntax: <code>solrs:url</code>
         * 
         * Path parameter: url (required)
         * Hostname and port for the Solr server(s). Multiple hosts can be
         * specified, separated with a comma. See the solrClient parameter for
         * more information on the SolrClient used to connect to Solr.
         * 
         * @param path url
         * @return the dsl builder
         */
        default SolrEndpointBuilder solrs(String path) {
            return SolrEndpointBuilderFactory.endpointBuilder("solrs", path);
        }
    }
    static SolrEndpointBuilder endpointBuilder(String componentName, String path) {
        class SolrEndpointBuilderImpl extends AbstractEndpointBuilder implements SolrEndpointBuilder {
            public SolrEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SolrEndpointBuilderImpl(path);
    }
}