/*
 * Copyright (c) Microsoft Corporation
 *
 * All rights reserved.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.microsoft.azure.hdinsight.sdk.rest.azure.serverless.spark.models.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.microsoft.azure.hdinsight.sdk.rest.azure.serverless.spark.models.SparkResourcePoolList;
import com.microsoft.azuretools.azurecommons.helpers.NotNull;

import java.util.Map;

/**
 * response of 'get /activityTypes/spark/resourcePools'
 */
public class GetSparkResourcePoolsListResponse {
    public static final Map<Integer, String> successfulResponses = ImmutableMap.of(
            200, "Successfully retrieved list of resource pools");

    @NotNull
    @JsonProperty(value = "sparkResourcePoolList")
    private SparkResourcePoolList sparkResourcePoolList;

    /**
     * Get the sparkResourcePoolList value.
     *
     * @return the sparkResourcePoolList value
     */
    @NotNull
    public SparkResourcePoolList sparkResourcePoolList() {
        return sparkResourcePoolList;
    }
}
