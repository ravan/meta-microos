SUMMARY = "Microsoft Azure Fluidrelay Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Fluidrelay Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-fluidrelay-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "5e8e6501e75014c39cdbeeb8655aee72941a78e280f43173ca3f2ed3968f59208cc11744811ad9c7266b4d740f719c4303128cf5341f8ac521f23eab131027f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-fluidrelay \
python3.13dist-azure-mgmt-fluidrelay \
python313-azure-mgmt-fluidrelay \
python3dist-azure-mgmt-fluidrelay"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.1 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
