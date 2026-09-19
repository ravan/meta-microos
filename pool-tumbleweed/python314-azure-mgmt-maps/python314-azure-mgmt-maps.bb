SUMMARY = "Microsoft Azure Maps Client Library"
DESCRIPTION = "This is the Microsoft Azure Maps Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-mgmt-maps-2.1.0-2.9.noarch.rpm"
RPM_HASH = "ab630d51df5371463a25c76167ee8573c318a69154c8691d2ca4485d3ad25efe733f019c4d7a84ae617ba342148ea0f05d4ad1a0fffa761b215b7646a2977662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-maps \
python314-azure-mgmt-maps \
python3dist-azure-mgmt-maps"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
