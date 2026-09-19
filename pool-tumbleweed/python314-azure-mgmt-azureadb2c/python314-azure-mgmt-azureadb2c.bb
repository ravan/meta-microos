SUMMARY = "Microsoft Azure Azureadb2c Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azureadb2c Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python314-azure-mgmt-azureadb2c-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "f15b16106138149e0f4592a64ea277b1707ccc7578c0be56d5c352543fa427aed221debf192337c6b042f631045badea92672885618d21dc0f913096528de25e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-azureadb2c \
python314-azure-mgmt-azureadb2c \
python3dist-azure-mgmt-azureadb2c"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
