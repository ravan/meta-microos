SUMMARY = "Microsoft Azure Subscription Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Subscription Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python314-azure-mgmt-subscription-3.1.1-2.9.noarch.rpm"
RPM_HASH = "e7bdd99ff51883f3030e3bf2a84c3e7720011ac8694071837b7e8e9eb208f4761f059fd0a214a20f30cb1030773b668493e5692100867c7b4ec31ee96d9ddcae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-subscription \
python314-azure-mgmt-subscription \
python3dist-azure-mgmt-subscription"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
