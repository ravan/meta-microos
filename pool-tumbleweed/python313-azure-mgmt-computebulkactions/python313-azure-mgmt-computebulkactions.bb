SUMMARY = "Microsoft Azure Computebulkactions Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computebulkactions Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-computebulkactions-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "cafe582e1673e2220839e12173b8bf3f6f0628158673c47a8a01bbb17086e970de2141b54015a9eb67ffa772cc0d6b551a59b4fd0a36d32998ac7f6f1d957f3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-computebulkactions \
python3.13dist-azure-mgmt-computebulkactions \
python313-azure-mgmt-computebulkactions \
python3dist-azure-mgmt-computebulkactions"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
