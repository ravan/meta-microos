SUMMARY = "Microsoft Azure Agrifood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agrifood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python313-azure-mgmt-agrifood-1.0.0b3-2.9.noarch.rpm"
RPM_HASH = "d7d52e45743817451d588e17ff6938080bac6e7cb131c8c065dbf660c4f6269bbc79f5d8cbd06455878f2f22d1f1de4b0663f1dd4a5b0d80e210179a5ddde8c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-agrifood \
python3.13dist-azure-mgmt-agrifood \
python313-azure-mgmt-agrifood \
python3dist-azure-mgmt-agrifood"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
