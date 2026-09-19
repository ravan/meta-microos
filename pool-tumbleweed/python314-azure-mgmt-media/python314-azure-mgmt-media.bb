SUMMARY = "Microsoft Azure Media Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Media Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.2.1"

RPM_NAME = "python314-azure-mgmt-media-10.2.1-1.5.noarch.rpm"
RPM_HASH = "287422c180df40f28727eff2454534b6396247a401397744c5f739e82e3d157771ad95fa17d688b63a542ff082976bae7ad4972e4f5cdbae90eb3342805a2091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-media \
python314-azure-mgmt-media \
python3dist-azure-mgmt-media"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
