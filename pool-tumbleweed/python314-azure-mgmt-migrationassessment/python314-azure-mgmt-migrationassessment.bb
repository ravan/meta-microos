SUMMARY = "Microsoft Azure Migrationassessment Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Migrationassessment Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-migrationassessment-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "35b8ab8fb624c67df17c90aab745f953535fe3e77ba5c490cfb5358e5b0f5e359b8ac66ba009adfc969d248d4aa1d0cee3e106e250e7d6524ecbaed77677eaab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-migrationassessment \
python314-azure-mgmt-migrationassessment \
python3dist-azure-mgmt-migrationassessment"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
