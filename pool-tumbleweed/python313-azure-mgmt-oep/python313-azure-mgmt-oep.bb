SUMMARY = "Microsoft Azure Oep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oep Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python313-azure-mgmt-oep-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "dff806776188941b94770f82a33ba916d8c0636c57a27c18c88ca96ed06a8c22a8c28c8e8070fcc1dabca28be53659bb01a61a6cfaf75aa546a7bc34631ee09f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-oep \
python3.13dist-azure-mgmt-oep \
python313-azure-mgmt-oep \
python3dist-azure-mgmt-oep"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
