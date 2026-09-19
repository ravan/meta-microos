SUMMARY = "Microsoft Azure Monitor Ingestion Client Library for Python"
DESCRIPTION = "The Azure Monitor Ingestion client library is used to send custom logs to Azure Monitor. \
 \
This library allows you to send data from virtually any source to supported built-in tables \
or to custom tables that you create in Log Analytics workspace. You can even extend the schema \
of built-in tables with custom columns."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-monitor-ingestion-1.1.0-1.5.noarch.rpm"
RPM_HASH = "abdf641931353ab0024475679e14ae5473e62633e13395c17482514c3ef0557c53012e6c407aa7ac12534a0fda70437ed869ca6cd2f51376395bc1b6fc47f940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-monitor-ingestion \
python314-azure-monitor-ingestion \
python3dist-azure-monitor-ingestion"

RDEPENDS:${PN} += "-python314-azure-core >= 1.28.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-monitor-nspkg \
python314-azure-nspkg \
python314-isodate"

inherit rpm
