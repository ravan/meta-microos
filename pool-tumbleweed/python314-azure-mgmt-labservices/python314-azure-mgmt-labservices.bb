SUMMARY = "Microsoft Azure Lab Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Lab Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-labservices-2.0.0-2.9.noarch.rpm"
RPM_HASH = "b5a082c77461c55eeb9c050822207183e4c99c9397e33d31816a90b50b3fc1a06f2ec767c60aa59bd3e238004b4e42b6e35d84408b40756f4d6406f88b049c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-labservices \
python314-azure-mgmt-labservices \
python3dist-azure-mgmt-labservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
