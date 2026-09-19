SUMMARY = "Microsoft Azure Reservations Client Library"
DESCRIPTION = "This is the Microsoft Azure Reservations Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python314-azure-mgmt-reservations-2.3.0-2.9.noarch.rpm"
RPM_HASH = "ea00066f223e5ed0d97a930c904d8c3fe1b060ebb644f8a58bab962d3c85cade91c73051a1c2add3ecd86e097a1f1bb87f92f872366fab6fd3259936679774bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-reservations \
python314-azure-mgmt-reservations \
python3dist-azure-mgmt-reservations"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
