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

RPM_NAME = "python313-azure-ai-metricsadvisor-1.0.1-1.9.noarch.rpm"
RPM_HASH = "bd259b26993f9305125eb51a71c5dfd187512bd79939ebdf26ad0a9a647b61ace0877ba0b1903cd8db0cf4b8debe7b1156b16da10b759e8f42cbbb570759f7ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-metricsadvisor \
python3.13dist-azure-ai-metricsadvisor \
python313-azure-ai-metricsadvisor \
python3dist-azure-ai-metricsadvisor"

RDEPENDS:${PN} += "-python313-azure-core >= 1.23.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-ai-nspkg \
python313-msrest"

inherit rpm
