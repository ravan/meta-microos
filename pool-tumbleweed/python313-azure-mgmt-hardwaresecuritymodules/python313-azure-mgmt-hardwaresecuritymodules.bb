SUMMARY = "Microsoft Azure Hardwaresecuritymodules Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hardwaresecuritymodules Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-hardwaresecuritymodules-1.0.0-1.1.noarch.rpm"
RPM_HASH = "8e797ce4067413d8962bdb7edbb26da3b6a0665f5a658cc7b7628bc61985e4006b4ffd19712bf283b5e3eeb5e37381431331b036b1d90fe8d656b29854745421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hardwaresecuritymodules \
python3.13dist-azure-mgmt-hardwaresecuritymodules \
python313-azure-mgmt-hardwaresecuritymodules \
python3dist-azure-mgmt-hardwaresecuritymodules"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
