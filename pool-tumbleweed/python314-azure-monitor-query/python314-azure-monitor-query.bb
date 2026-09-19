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

RPM_NAME = "python314-azure-monitor-query-2.0.0-1.5.noarch.rpm"
RPM_HASH = "7024bd3cc77a147e8f7a771948a69003e0866a1d2d5f6d72f1c62f93af6e2ae3514bb2d877ee3a43da41f22a73e8abded0658f8be924e73b06f4f7a012fd7b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-monitor-query \
python314-azure-monitor-query \
python3dist-azure-monitor-query"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-monitor-nspkg \
python314-azure-nspkg \
python314-isodate \
python314-typing-extensions"

inherit rpm
