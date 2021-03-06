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
package org.apache.camel.component.aws2.s3.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.aws2.s3.AWS2S3Component;
import org.apache.camel.component.aws2.s3.AWS2S3Operations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import software.amazon.awssdk.core.Protocol;

/**
 * The aws2-s3 component is used for storing and retrieving object from Amazon
 * S3 Storage Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws2-s3")
public class AWS2S3ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws2-s3 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Reference to a com.amazonaws.services.s3.AmazonS3 in the registry. The
     * option is a software.amazon.awssdk.services.s3.S3Client type.
     */
    private String amazonS3Client;
    /**
     * Setting the autocreation of the bucket
     */
    private Boolean autoCreateBucket = true;
    /**
     * The component configuration. The option is a
     * org.apache.camel.component.aws2.s3.AWS2S3Configuration type.
     */
    private String configuration;
    /**
     * Whether or not the S3 client should use path style access
     */
    private Boolean pathStyleAccess = false;
    /**
     * The policy for this queue to set in the
     * com.amazonaws.services.s3.AmazonS3#setBucketPolicy() method.
     */
    private String policy;
    /**
     * To define a proxy host when instantiating the SQS client
     */
    private String proxyHost;
    /**
     * Specify a proxy port to be used inside the client definition.
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the S3 client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * The region in which S3 client needs to work. When using this parameter,
     * the configuration will expect the lowercase name of the region (for
     * example ap-east-1) You'll need to use the name Region.EU_WEST_1.id()
     */
    private String region;
    /**
     * Set whether the S3 client should expect to load credentials on an EC2
     * instance or to expect static credentials to be passed in.
     */
    private Boolean useIAMCredentials = false;
    /**
     * The encryption materials to use in case of Symmetric/Asymmetric client
     * usage. The option is a
     * software.amazon.awssdk.services.s3.model.Encryption type.
     */
    private String encryptionMaterials;
    /**
     * Define if encryption must be used or not
     */
    private Boolean useEncryption = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Delete objects from S3 after they have been retrieved. The delete is only
     * performed if the Exchange is committed. If a rollback occurs, the object
     * is not deleted. If this option is false, then the same objects will be
     * retrieve over and over again on the polls. Therefore you need to use the
     * Idempotent Consumer EIP in the route to filter out duplicates. You can
     * filter using the AWS2S3Constants#BUCKET_NAME and AWS2S3Constants#KEY
     * headers, or only the AWS2S3Constants#KEY header.
     */
    private Boolean deleteAfterRead = true;
    /**
     * The delimiter which is used in the
     * com.amazonaws.services.s3.model.ListObjectsRequest to only consume
     * objects we are interested in.
     */
    private String delimiter;
    /**
     * To get the object from the bucket with the given file name
     */
    private String fileName;
    /**
     * If it is true, the exchange body will be set to a stream to the contents
     * of the file. If false, the headers will be set with the S3 object
     * metadata, but the body will be null. This option is strongly related to
     * autocloseBody option. In case of setting includeBody to true and
     * autocloseBody to false, it will be up to the caller to close the S3Object
     * stream. Setting autocloseBody to true, will close the S3Object stream
     * automatically.
     */
    private Boolean includeBody = true;
    /**
     * The prefix which is used in the
     * com.amazonaws.services.s3.model.ListObjectsRequest to only consume
     * objects we are interested in.
     */
    private String prefix;
    /**
     * If this option is true and includeBody is true, then the S3Object.close()
     * method will be called on exchange completion. This option is strongly
     * related to includeBody option. In case of setting includeBody to true and
     * autocloseBody to false, it will be up to the caller to close the S3Object
     * stream. Setting autocloseBody to true, will close the S3Object stream
     * automatically.
     */
    private Boolean autocloseBody = true;
    /**
     * Delete file object after the S3 file has been uploaded
     */
    private Boolean deleteAfterWrite = false;
    /**
     * Setting the key name for an element in the bucket through endpoint
     * parameter
     */
    private String keyName;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * If it is true, camel will upload the file with multi part format, the
     * part size is decided by the option of partSize
     */
    private Boolean multiPartUpload = false;
    /**
     * The operation to do in case the user don't want to do only an upload
     */
    private AWS2S3Operations operation;
    /**
     * Setup the partSize which is used in multi part upload, the default size
     * is 25M.
     */
    private Long partSize = 26214400L;
    /**
     * Sets the server-side encryption algorithm when encrypting the object
     * using AWS-managed keys. For example use AES256.
     */
    private String serverSideEncryption;
    /**
     * The storage class to set in the
     * com.amazonaws.services.s3.model.PutObjectRequest request.
     */
    private String storageClass;
    /**
     * Define the id of KMS key to use in case KMS is enabled
     */
    private String awsKMSKeyId;
    /**
     * Define if KMS must be used or not
     */
    private Boolean useAwsKMS = false;
    /**
     * Define if Accelerate Mode enabled is true or false
     */
    private Boolean accelerateModeEnabled = false;
    /**
     * Define if disabled Chunked Encoding is true or false
     */
    private Boolean chunkedEncodingDisabled = false;
    /**
     * Define if Dualstack enabled is true or false
     */
    private Boolean dualstackEnabled = false;
    /**
     * Define if Force Global Bucket Access enabled is true or false
     */
    private Boolean forceGlobalBucketAccessEnabled = false;
    /**
     * Define if Payload Signing enabled is true or false
     */
    private Boolean payloadSigningEnabled = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;

    public String getAmazonS3Client() {
        return amazonS3Client;
    }

    public void setAmazonS3Client(String amazonS3Client) {
        this.amazonS3Client = amazonS3Client;
    }

    public Boolean getAutoCreateBucket() {
        return autoCreateBucket;
    }

    public void setAutoCreateBucket(Boolean autoCreateBucket) {
        this.autoCreateBucket = autoCreateBucket;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public Boolean getPathStyleAccess() {
        return pathStyleAccess;
    }

    public void setPathStyleAccess(Boolean pathStyleAccess) {
        this.pathStyleAccess = pathStyleAccess;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getUseIAMCredentials() {
        return useIAMCredentials;
    }

    public void setUseIAMCredentials(Boolean useIAMCredentials) {
        this.useIAMCredentials = useIAMCredentials;
    }

    public String getEncryptionMaterials() {
        return encryptionMaterials;
    }

    public void setEncryptionMaterials(String encryptionMaterials) {
        this.encryptionMaterials = encryptionMaterials;
    }

    public Boolean getUseEncryption() {
        return useEncryption;
    }

    public void setUseEncryption(Boolean useEncryption) {
        this.useEncryption = useEncryption;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getDeleteAfterRead() {
        return deleteAfterRead;
    }

    public void setDeleteAfterRead(Boolean deleteAfterRead) {
        this.deleteAfterRead = deleteAfterRead;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Boolean getIncludeBody() {
        return includeBody;
    }

    public void setIncludeBody(Boolean includeBody) {
        this.includeBody = includeBody;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Boolean getAutocloseBody() {
        return autocloseBody;
    }

    public void setAutocloseBody(Boolean autocloseBody) {
        this.autocloseBody = autocloseBody;
    }

    public Boolean getDeleteAfterWrite() {
        return deleteAfterWrite;
    }

    public void setDeleteAfterWrite(Boolean deleteAfterWrite) {
        this.deleteAfterWrite = deleteAfterWrite;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getMultiPartUpload() {
        return multiPartUpload;
    }

    public void setMultiPartUpload(Boolean multiPartUpload) {
        this.multiPartUpload = multiPartUpload;
    }

    public AWS2S3Operations getOperation() {
        return operation;
    }

    public void setOperation(AWS2S3Operations operation) {
        this.operation = operation;
    }

    public Long getPartSize() {
        return partSize;
    }

    public void setPartSize(Long partSize) {
        this.partSize = partSize;
    }

    public String getServerSideEncryption() {
        return serverSideEncryption;
    }

    public void setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
    }

    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public String getAwsKMSKeyId() {
        return awsKMSKeyId;
    }

    public void setAwsKMSKeyId(String awsKMSKeyId) {
        this.awsKMSKeyId = awsKMSKeyId;
    }

    public Boolean getUseAwsKMS() {
        return useAwsKMS;
    }

    public void setUseAwsKMS(Boolean useAwsKMS) {
        this.useAwsKMS = useAwsKMS;
    }

    public Boolean getAccelerateModeEnabled() {
        return accelerateModeEnabled;
    }

    public void setAccelerateModeEnabled(Boolean accelerateModeEnabled) {
        this.accelerateModeEnabled = accelerateModeEnabled;
    }

    public Boolean getChunkedEncodingDisabled() {
        return chunkedEncodingDisabled;
    }

    public void setChunkedEncodingDisabled(Boolean chunkedEncodingDisabled) {
        this.chunkedEncodingDisabled = chunkedEncodingDisabled;
    }

    public Boolean getDualstackEnabled() {
        return dualstackEnabled;
    }

    public void setDualstackEnabled(Boolean dualstackEnabled) {
        this.dualstackEnabled = dualstackEnabled;
    }

    public Boolean getForceGlobalBucketAccessEnabled() {
        return forceGlobalBucketAccessEnabled;
    }

    public void setForceGlobalBucketAccessEnabled(
            Boolean forceGlobalBucketAccessEnabled) {
        this.forceGlobalBucketAccessEnabled = forceGlobalBucketAccessEnabled;
    }

    public Boolean getPayloadSigningEnabled() {
        return payloadSigningEnabled;
    }

    public void setPayloadSigningEnabled(Boolean payloadSigningEnabled) {
        this.payloadSigningEnabled = payloadSigningEnabled;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}