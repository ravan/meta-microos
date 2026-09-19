SUMMARY = "Microsoft Azure Monitor Ingestion Client Library for Python"
DESCRIPTION = "The Azure Monitor Ingestion client library is used to send custom logs to Azure Monitor. \
 \
This library allows you to send data from virtually any source to supported built-in tables \
or to custom tables that you create in Log Analytics workspace. You can even extend the schema \
of built-in tables with custom columns."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-monitor-ingestion-1.1.0-1.5.noarch.rpm"
RPM_HASH = "3cdfbf0bc9f21ba6d2383b372a7ee7b6e4a1cd062773ab752b881f34e09fbee8ffd99edc655aaea0c19da03d9e2ab6dc8827b012f7cbccb6f0d833df9aac2aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-ingestion \
python3.13dist-azure-monitor-ingestion \
python313-azure-monitor-ingestion \
python3dist-azure-monitor-ingestion"

RDEPENDS:${PN} += "-python313-azure-core >= 1.28.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-monitor-nspkg \
python313-azure-nspkg \
python313-isodate"

inherit rpm
