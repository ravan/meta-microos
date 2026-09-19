SUMMARY = "Microsoft Azure Dev Spaces Client Library"
DESCRIPTION = "This is the Microsoft Azure Dev Spaces Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python314-azure-mgmt-devspaces-1.0.0b3-2.9.noarch.rpm"
RPM_HASH = "0c9884c7494d4ac3cdd344f8d1f32e799b5c32d95f005a15a2c19f046845e7cd7c37d3c49d5bebf5be8e872e8a4f48f9bb3b2078b5c8b2e34257cbd821bc8187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-devspaces \
python314-azure-mgmt-devspaces \
python3dist-azure-mgmt-devspaces"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
