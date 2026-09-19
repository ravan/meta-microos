SUMMARY = "Microsoft Azure Azureadb2c Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azureadb2c Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python313-azure-mgmt-azureadb2c-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "f597a6a5478b9920784a1de50255f0570440101045a0848b848c78c8af7e843d72c3123a1c82d93f3df5e4f1e3e6039335b029fe00d8fb196a62eca4538bc1a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azureadb2c \
python3.13dist-azure-mgmt-azureadb2c \
python313-azure-mgmt-azureadb2c \
python3dist-azure-mgmt-azureadb2c"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
