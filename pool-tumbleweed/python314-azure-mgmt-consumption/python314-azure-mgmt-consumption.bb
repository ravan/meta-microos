SUMMARY = "Microsoft Azure Consumption Client Library"
DESCRIPTION = "This is the Microsoft Azure Consumption Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.0"

RPM_NAME = "python314-azure-mgmt-consumption-11.0.0-1.1.noarch.rpm"
RPM_HASH = "3cd6065f65c2b5f2e690e7c563ab7aeb6db95a8ead61aea6cec2f66cb3150e051316bff7c4744a096f54c9d7ecc7a6f79ea4dc9137d43dfb6ea0faf1ee3136cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-consumption \
python314-azure-mgmt-consumption \
python3dist-azure-mgmt-consumption"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
