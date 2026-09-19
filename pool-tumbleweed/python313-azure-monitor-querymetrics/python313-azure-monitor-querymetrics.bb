SUMMARY = "Microsoft Azure Monitor Query Metrics Client Library for Python"
DESCRIPTION = "The Azure Monitor Query Metrics client library enables you to perform read-only queries \
against Azure Monitor's metrics data platform. It is designed for retrieving numerical \
metrics from Azure resources, supporting scenarios such as monitoring, alerting, and \
troubleshooting. \
 \
 * Metrics: Numeric data collected from resources at regular intervals, stored as time \
   series. Metrics provide insights into resource health and performance, and are \
   optimized for near real-time analysis. \
 \
This library interacts with the Azure Monitor Metrics Data Plane API, allowing you to query \
metrics for multiple resources in a single request. For details on batch querying, see Batch \
API migration guide."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-monitor-querymetrics-1.0.0-1.5.noarch.rpm"
RPM_HASH = "f377b958317e8b8791208bc45ed0e70eae0a7ddb4ea66af7ed160e80f29203a954a43e57e96833d98c9ec377ecfaca5e85a7c4d236fee4a0c39688e3d9361cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-querymetrics \
python3.13dist-azure-monitor-querymetrics \
python313-azure-monitor-querymetrics \
python3dist-azure-monitor-querymetrics"

RDEPENDS:${PN} += "-python313-azure-core >= 1.28.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-monitor-nspkg \
python313-azure-nspkg \
python313-isodate"

inherit rpm
