SUMMARY = "Microsoft Azure Traffic Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Traffic Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-trafficmanager-1.1.0-2.9.noarch.rpm"
RPM_HASH = "17e31ef3e79b655eec326ac0e54fd2d8da13695e974f176eba286f34474a59d09c9eda4c341f5a7d5a77d14bd3a6f6c6f122b42ebe2bd69bda6e02aedf281276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-trafficmanager \
python3.13dist-azure-mgmt-trafficmanager \
python313-azure-mgmt-trafficmanager \
python3dist-azure-mgmt-trafficmanager"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
