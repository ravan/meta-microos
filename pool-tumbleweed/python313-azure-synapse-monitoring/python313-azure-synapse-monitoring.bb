SUMMARY = "Microsoft Azure Synapse Monitoring Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Monitoring Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-azure-synapse-monitoring-0.2.0-3.9.noarch.rpm"
RPM_HASH = "7909013dd0d13590011c106243b77c89c32e02185221007cc9dc5692b8bf6088843f23487f2ef2739d2a24abb17de954c19e8fc12c2ca7eeb948bc320f315b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse-monitoring \
python3.13dist-azure-synapse-monitoring \
python313-azure-synapse-monitoring \
python3dist-azure-synapse-monitoring"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.6.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-synapse-nspkg \
python313-msrest"

inherit rpm
