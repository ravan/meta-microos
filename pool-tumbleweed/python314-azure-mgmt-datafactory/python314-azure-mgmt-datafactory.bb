SUMMARY = "Microsoft Azure Data Factory Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Factory Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.3.0"

RPM_NAME = "python314-azure-mgmt-datafactory-9.3.0-1.3.noarch.rpm"
RPM_HASH = "9e2d5ef273a96133a86f126d80ab6d3d33325c8f01111c5be6e09c4d7810b3b52bef0afaf5f91e078a13029ce5954e80aff3c3d88dfdba12076d0c61820004e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-datafactory \
python314-azure-mgmt-datafactory \
python3dist-azure-mgmt-datafactory"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
