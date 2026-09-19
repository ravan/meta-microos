SUMMARY = "Microsoft Azure Metrics Advisor Client Library for Python"
DESCRIPTION = "Metrics Advisor is a scalable real-time time series monitoring, alerting, and root cause analysis platform. \
 \
Use Metrics Advisor to: \
 \
 * Analyze multi-dimensional data from multiple data sources \
 * Identify and correlate anomalies \
 * Configure and fine-tune the anomaly detection model used on your data \
 * Diagnose anomalies and help with root cause analysis"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-ai-metricsadvisor-1.0.1-1.9.noarch.rpm"
RPM_HASH = "4dfaa7e49f9cee6554ff1133c4f8d8dbb07cd8fd567047a148c5743cdb9d0e61fc32060095f541a1aee270809fbb830daebdfbb67a138c1c85bc971f7f33411f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-metricsadvisor \
python314-azure-ai-metricsadvisor \
python3dist-azure-ai-metricsadvisor"

RDEPENDS:${PN} += "-python314-azure-core >= 1.23.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-ai-nspkg \
python314-msrest"

inherit rpm
