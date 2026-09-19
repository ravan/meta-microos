SUMMARY = "Microsoft Azure Synapse Monitoring Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Monitoring Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-azure-synapse-monitoring-0.2.0-3.9.noarch.rpm"
RPM_HASH = "d71f3502f23e2b28f9801e5fd943037d9a7aca6da053fac1b00447eaa88c6ea5f8d4e134ddb942f8ab69efdfd68b13627fd5eb7893f6fc50d4b81f8f38ceba15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-synapse-monitoring \
python314-azure-synapse-monitoring \
python3dist-azure-synapse-monitoring"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.6.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-synapse-nspkg \
python314-msrest"

inherit rpm
