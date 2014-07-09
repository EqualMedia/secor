package com.state.secor.util;

import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;

public class SecorAWSCredentialsProviderChain  extends AWSCredentialsProviderChain {
    /**
     * AWS credentials provider chain that looks for credentials in this order:
     * <ul>
     *   <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     *   <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * </ul>
     *
     * @see InstanceProfileCredentialsProvider
     * @see SystemPropertiesCredentialsProvider
     *
     */
    public SecorAWSCredentialsProviderChain() {
        super(new InstanceProfileCredentialsProvider(), new SystemPropertiesCredentialsProvider());
    }
}
