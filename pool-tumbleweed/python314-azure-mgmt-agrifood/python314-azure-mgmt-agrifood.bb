SUMMARY = "Microsoft Azure Agrifood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agrifood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python314-azure-mgmt-agrifood-1.0.0b3-2.9.noarch.rpm"
RPM_HASH = "02854c072db5d7fba669f2588d7a634d26276274d7639053c026b933a38016846fb078640a1702fd75db5502b3a6c484d14538f29eb1f196f3a559fe5e4824bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-agrifood \
python314-azure-mgmt-agrifood \
python3dist-azure-mgmt-agrifood"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
