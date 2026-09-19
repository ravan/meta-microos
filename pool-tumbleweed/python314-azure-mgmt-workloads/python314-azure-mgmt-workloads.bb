SUMMARY = "Microsoft Azure Workloads Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloads Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-workloads-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "372ecc7b06dd8462fa81ebec27934b3801bc842d18a2a8109837996414ce3ebe4dafc0864e57fa450009ebbd6bca6afe1ac8ec7e53f6ace985dd758bf937d32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-workloads \
python314-azure-mgmt-workloads \
python3dist-azure-mgmt-workloads"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
