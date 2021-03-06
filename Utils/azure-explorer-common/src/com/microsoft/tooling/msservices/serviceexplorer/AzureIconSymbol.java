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

package com.microsoft.tooling.msservices.serviceexplorer;

import com.google.common.base.Preconditions;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class AzureIconSymbol {

    // This needs to be at the beginning for the initialization to happen correctly
    private static final ConcurrentMap<String, AzureIconSymbol> VALUES_BY_NAME = new ConcurrentHashMap<>();
    private static final String ICON_BASE_DIR = "/icons/";
    @Getter
    private final String path;

    private AzureIconSymbol(String path) {
        this.path = path;
        VALUES_BY_NAME.put(path, this);
    }

    public interface Common {

        AzureIconSymbol AZURE = fillInPath("common/Azure.svg");
        AzureIconSymbol AZURE_ACTIVE_LOG = fillInPath("common/AzureActiveLog.svg");

        AzureIconSymbol REFRESH = fillInPath("common/Refresh.svg");
        AzureIconSymbol CREATE = fillInPath("common/Create.svg");

        AzureIconSymbol DELETE = fillInPath("common/Delete.svg");
        AzureIconSymbol START = fillInPath("common/Start.svg");
        AzureIconSymbol STOP = fillInPath("common/Stop.svg");
        AzureIconSymbol RESTART = fillInPath("common/Restart.svg");

        AzureIconSymbol OPEN_IN_PORTAL = fillInPath("common/OpenInPortal.svg");
        AzureIconSymbol SHOW_PROPERTIES = fillInPath("common/ShowProperties.svg");
    }

    public interface MySQL {

        AzureIconSymbol MODULE = fillInPath("mysql/MySQL.svg");

        AzureIconSymbol RUNNING = fillInPath("mysql/MySQLRunning.svg");
        AzureIconSymbol STOPPED = fillInPath("mysql/MySQLStopped.svg");
        AzureIconSymbol UPDATING = fillInPath("mysql/MySQLUpdating.svg");

        AzureIconSymbol CONNECT_TO_SERVER = fillInPath("mysql/ConnectToServer.svg");
        AzureIconSymbol BIND_INTO = fillInPath("mysql/BindInto.svg");

    }

    public interface WebApp {

        AzureIconSymbol MODULE = fillInPath("WebApp/WebApp.svg");

        AzureIconSymbol RUNNING = fillInPath("WebApp/WebAppRunning.svg");
        AzureIconSymbol STOPPED = fillInPath("WebApp/WebAppStopped.svg");
        AzureIconSymbol UPDATING = fillInPath("WebApp/WebAppUpdating.svg");
        AzureIconSymbol RUNNING_ON_LINUX = fillInPath("WebApp/WebAppRunningOnLinux.svg");
        AzureIconSymbol STOPPED_ON_LINUX = fillInPath("WebApp/WebAppStoppedOnLinux.svg");
        AzureIconSymbol UPDATING_ON_LINUX = fillInPath("WebApp/WebAppUpdatingOnLinux.svg");
    }

    public interface DeploymentSlot {

        AzureIconSymbol MODULE = fillInPath("DeploymentSlot/DeploymentSlot.svg");

        AzureIconSymbol RUNNING = fillInPath("DeploymentSlot/DeploymentSlotRunning.svg");
        AzureIconSymbol STOPPED = fillInPath("DeploymentSlot/DeploymentSlotStopped.svg");
        AzureIconSymbol UPDATING = fillInPath("DeploymentSlot/DeploymentSlotUpdating.svg");
    }

    public interface FunctionApp {

        AzureIconSymbol MODULE = fillInPath("FunctionApp/FunctionApp.svg");

        AzureIconSymbol RUNNING = fillInPath("FunctionApp/FunctionAppRunning.svg");
        AzureIconSymbol STOPPED = fillInPath("FunctionApp/FunctionAppStopped.svg");
        AzureIconSymbol UPDATING = fillInPath("FunctionApp/FunctionAppUpdating.svg");
    }

    public interface SpringCloud {

        AzureIconSymbol MODULE = fillInPath("SpringCloud/SpringCloud.svg");

        AzureIconSymbol CLUSTER = fillInPath("SpringCloud/SpringCloudApp.svg");

        AzureIconSymbol RUNNING = fillInPath("SpringCloud/SpringCloudAppRunning.svg");
        AzureIconSymbol STOPPED = fillInPath("SpringCloud/SpringCloudAppStopped.svg");
        AzureIconSymbol UPDATING = fillInPath("SpringCloud/SpringCloudAppUpdating.svg");
        AzureIconSymbol FAILED = fillInPath("SpringCloud/SpringCloudAppFailed.svg");
        AzureIconSymbol PENDING = fillInPath("SpringCloud/SpringCloudAppPending.svg");
        AzureIconSymbol UNKNOWN = fillInPath("SpringCloud/SpringCloudAppUnknown.svg");
    }

    public interface ApacheSparkOnAzureSynapse {

        AzureIconSymbol MODULE = fillInPath("ApacheSparkOnAzureSynapse/ApacheSparkOnAzureSynapse.svg");
    }

    public interface ApacheSparkOnCosmos {

        AzureIconSymbol MODULE = fillInPath("ApacheSparkOnCosmos/ApacheSparkOnCosmos.svg");
    }

    public interface ContainerRegistry {

        AzureIconSymbol MODULE = fillInPath("ContainerRegistry/ContainerRegistry.svg");
    }

    public interface HDInsight {

        AzureIconSymbol MODULE = fillInPath("HDInsight/HDInsight.svg");
    }

    public interface RedisCache {

        AzureIconSymbol MODULE = fillInPath("RedisCache/RedisCache.svg");

        AzureIconSymbol RUNNING = fillInPath("RedisCache/RedisCacheRunning.svg");
        AzureIconSymbol STOPPED = fillInPath("RedisCache/RedisCacheStopped.svg");
        AzureIconSymbol UPDATING = fillInPath("RedisCache/RedisCacheUpdating.svg");
    }

    public interface ResourceManagement {

        AzureIconSymbol MODULE = fillInPath("ResourceManagement/ResourceManagement.svg");
    }

    public interface StorageAccount {

        AzureIconSymbol MODULE = fillInPath("StorageAccount/StorageAccount.svg");
    }

    public interface VirtualMachine {

        AzureIconSymbol MODULE = fillInPath("VirtualMachine/VirtualMachine.svg");

        AzureIconSymbol RUNNING = fillInPath("VirtualMachine/VirtualMachineRunning.svg");
        AzureIconSymbol STOPPED = fillInPath("VirtualMachine/VirtualMachineStopped.svg");
        AzureIconSymbol UPDATING = fillInPath("VirtualMachine/VirtualMachineUpdating.svg");
    }

    public interface SQLServerBigDataCluster {

        AzureIconSymbol MODULE = fillInPath("SQLServerBigDataCluster/SqlServerBigDataCluster.svg");
    }

    public static AzureIconSymbol fromPath(String path) {
        Preconditions.checkArgument(StringUtils.isNotBlank(path), "path can not be blank.");
        AzureIconSymbol symbol = VALUES_BY_NAME.get(path);
        if (symbol != null) {
            return symbol;
        } else {
            return new AzureIconSymbol(path);
        }
    }

    @Override
    public int hashCode() {
        return this.path.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (!(obj instanceof AzureIconSymbol)) {
            return false;
        } else if (obj == this) {
            return true;
        } else {
            AzureIconSymbol rhs = (AzureIconSymbol) obj;
            return this.path.equalsIgnoreCase(rhs.path);
        }
    }

    private static AzureIconSymbol fillInPath(String relativePath) {
        return new AzureIconSymbol(ICON_BASE_DIR + relativePath);
    }

}
