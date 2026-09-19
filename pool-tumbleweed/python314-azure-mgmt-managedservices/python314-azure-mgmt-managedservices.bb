SUMMARY = "Microsoft Azure Managed Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Managed Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python314-azure-mgmt-managedservices-6.0.1-1.2.noarch.rpm"
RPM_HASH = "8ad8a24dfe6e50daeb99ee7e2e6a3c7dee4dc2706733814ac6d8dee38fc8f5323f907e38a144510e86252dc9c33d200a844d9f4b25e01d944617ba323cc5f08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-managedservices \
python314-azure-mgmt-managedservices \
python3dist-azure-mgmt-managedservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
