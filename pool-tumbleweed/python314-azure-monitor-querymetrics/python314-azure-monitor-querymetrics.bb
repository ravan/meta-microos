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

RPM_NAME = "python314-azure-monitor-querymetrics-1.0.0-1.5.noarch.rpm"
RPM_HASH = "c70b2289f767b11b46bd7c751c9adb9f04935733c61dee2dcc557acb8a270fec5068aaece4426a69bef46f42831b99f1ab69982e185ece8ab54bee86255d0de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-monitor-querymetrics \
python314-azure-monitor-querymetrics \
python3dist-azure-monitor-querymetrics"

RDEPENDS:${PN} += "-python314-azure-core >= 1.28.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-monitor-nspkg \
python314-azure-nspkg \
python314-isodate"

inherit rpm
