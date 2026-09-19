SUMMARY = "Microsoft Azure Search Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Search Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python314-azure-mgmt-search-9.2.0-1.5.noarch.rpm"
RPM_HASH = "d873f923f00a175e56539e62fd8ba02f0df18fba448b453205fa887b7eb22dd73e6d14e32932814c6c30b97d0d241d735af124e481475b7af18a22f1c6aaa0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-search \
python314-azure-mgmt-search \
python3dist-azure-mgmt-search"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
