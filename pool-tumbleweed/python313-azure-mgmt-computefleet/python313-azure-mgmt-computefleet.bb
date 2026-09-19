SUMMARY = "Microsoft Azure Computefleet Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computefleet Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-computefleet-1.0.0-1.9.noarch.rpm"
RPM_HASH = "8b1bc3ccaef79fc6b0839d2e705e8af093e70d410dd1aef6fcb7587824e3dbb3e5a00ff26f73a4a2c209b061c51d782cf22ead93cd3ecd37187332b8d9f8e0e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-computefleet \
python3.13dist-azure-mgmt-computefleet \
python313-azure-mgmt-computefleet \
python3dist-azure-mgmt-computefleet"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
