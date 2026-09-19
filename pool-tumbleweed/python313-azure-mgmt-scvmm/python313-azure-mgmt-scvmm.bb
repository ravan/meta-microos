SUMMARY = "Microsoft Azure Scvmm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Scvmm Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-scvmm-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "50fe006238d46f5fc2db9bc8f4bf22bcb68fdc392f9f1caddf8d043c5674626b140948272e12e5c78ba401d26c23a106caa05008f89d34ee71f50d5fed62bfb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-scvmm \
python3.13dist-azure-mgmt-scvmm \
python313-azure-mgmt-scvmm \
python3dist-azure-mgmt-scvmm"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
