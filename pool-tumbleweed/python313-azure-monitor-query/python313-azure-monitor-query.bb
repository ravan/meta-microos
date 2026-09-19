SUMMARY = "Microsoft Azure Azure Monitor Query Client Library for Python"
DESCRIPTION = "Azure Monitor helps you maximize the availability and performance of your applications and \
services. It delivers a comprehensive solution for collecting, analyzing, and acting on \
telemetry from your cloud and on-premises environments. \
 \
All data collected by Azure Monitor fits into one of two fundamental types, metrics and logs. \
Metrics are numerical values that describe some aspect of a system at a particular point in \
time. They are lightweight and capable of supporting near real-time scenarios. Logs contain \
different kinds of data organized into records with different sets of properties for each \
type. Telemetry such as events and traces are stored as logs in addition to performance data \
so that it can all be combined for analysis."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-monitor-query-2.0.0-1.5.noarch.rpm"
RPM_HASH = "757313338e8d1d3bf42b2251f873dd580a911bca338d4c1d8f92a4c453272b06f7e2db5ebebe7b1672bd1dc4d4fe6fb2669ad668b43e5fb997fb87ed3ee9a1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-query \
python3.13dist-azure-monitor-query \
python313-azure-monitor-query \
python3dist-azure-monitor-query"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-monitor-nspkg \
python313-azure-nspkg \
python313-isodate \
python313-typing-extensions"

inherit rpm
