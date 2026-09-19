SUMMARY = "Microsoft Azure Migrationassessment Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Migrationassessment Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-migrationassessment-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "5d84834069bafaf7ebe206e3210b8c82c7ee03c8f60f989a500b998f9dc3f64cfe3243048830948945d3a7a69db83d9a2427b196324636ed0ab3e86de93dbbf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-migrationassessment \
python3.13dist-azure-mgmt-migrationassessment \
python313-azure-mgmt-migrationassessment \
python3dist-azure-mgmt-migrationassessment"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
