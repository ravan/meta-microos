SUMMARY = "Microsoft Azure Testbase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Testbase Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python314-azure-mgmt-testbase-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "944740d7843386b061c6337027cab07c98fcb93b2585a199b697ec15f6540c8849be7c15953f7c062d5d293676d225f70d4a2c928119077d9a1ca5d8f6f1385e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-testbase \
python314-azure-mgmt-testbase \
python3dist-azure-mgmt-testbase"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
