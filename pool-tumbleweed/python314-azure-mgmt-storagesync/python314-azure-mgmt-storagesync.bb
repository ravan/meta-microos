SUMMARY = "Microsoft Azure Storage Sync Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Sync Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-mgmt-storagesync-2.1.0-1.1.noarch.rpm"
RPM_HASH = "54812e3864938739f1cb1a53795f898c235b3b4199d81696b6085fd1f5dbc6d1234a5241d1f39e515424ff9b4b534ae6941510e87dbb3e1bd8b6f425dd0ab6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-storagesync \
python314-azure-mgmt-storagesync \
python3dist-azure-mgmt-storagesync"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
