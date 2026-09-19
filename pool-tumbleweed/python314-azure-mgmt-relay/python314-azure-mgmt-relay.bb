SUMMARY = "Microsoft Azure Relay Client Library"
DESCRIPTION = "This is the Microsoft Azure Relay Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-relay-2.0.0-1.1.noarch.rpm"
RPM_HASH = "00e496c0398bebc4bc78e5b0cecc0c1756a36e95d53cb5a77a468239d87c7f326251260988818c3c514c6d6a3c1f146a55ab07ab5223b7bdc142fd5ee1b4f39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-relay \
python314-azure-mgmt-relay \
python3dist-azure-mgmt-relay"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
