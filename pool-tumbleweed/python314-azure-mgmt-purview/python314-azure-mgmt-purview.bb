SUMMARY = "Microsoft Azure Purview Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purview Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-purview-1.0.1-1.2.noarch.rpm"
RPM_HASH = "ad0bdd15b90965c5c6069e82c4651a5237ba5d5cd9d26e6bbea9d78203a5505ed57cb6c7f989f871309e00085cbdb753d0449cef25555c8494e47bf8361d5139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-purview \
python314-azure-mgmt-purview \
python3dist-azure-mgmt-purview"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
