SUMMARY = "Microsoft Azure Hybridcontainerservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridcontainerservice Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-hybridcontainerservice-1.0.0-2.9.noarch.rpm"
RPM_HASH = "eff8e07fde1e9fdc0ac7dd786faa88f05602e8e932b0936b236b5f1be95e2193143e01ef602372ad794941412bfb0f7040f7f6a90d24b1bf27db88cadcf3152f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hybridcontainerservice \
python314-azure-mgmt-hybridcontainerservice \
python3dist-azure-mgmt-hybridcontainerservice"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
