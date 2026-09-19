SUMMARY = "Microsoft Azure Traffic Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Traffic Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-trafficmanager-1.1.0-2.9.noarch.rpm"
RPM_HASH = "1e3785d4810b6f52b55d68f357c4795da244d53886e018519b3b18a47f9c39622350c759c9fd514a59404e977ce3017cadcfc5fdec7095595ec8bf51117244ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-trafficmanager \
python314-azure-mgmt-trafficmanager \
python3dist-azure-mgmt-trafficmanager"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
