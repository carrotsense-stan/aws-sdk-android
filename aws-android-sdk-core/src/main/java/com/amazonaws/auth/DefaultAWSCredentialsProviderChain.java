/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.auth;

/**
 * AWS credentials provider chain that looks for credentials in this order:
 * <ul>
 * <li>System Properties - aws.accessKeyId and aws.secretKey</li>
 * <li>Classpath Properties File - AwsCredentials.properties in classpath</li>
 * </ul>
 *
 * @see SystemPropertiesCredentialsProvider
 * @see ClasspathPropertiesFileCredentialsProvider
 */
@Deprecated
public class DefaultAWSCredentialsProviderChain extends AWSCredentialsProviderChain {
    public DefaultAWSCredentialsProviderChain() {
        super(new SystemPropertiesCredentialsProvider(),
                new ClasspathPropertiesFileCredentialsProvider());
    }
}
