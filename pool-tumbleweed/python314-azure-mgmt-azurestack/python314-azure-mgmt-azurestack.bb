SUMMARY = "Microsoft Azure AzureStack Management Client Library"
DESCRIPTION = "This is the Microsoft Azure AzureStack Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-azurestack-1.0.1-1.2.noarch.rpm"
RPM_HASH = "4bbd4e558f7fba4a4c9a8acd3ec6c5e6fe3c00408c7f1d2117b042b398508d4d52dac6d369fee58f87a96bae4d8ea5a9dfbf3d6b891cea138fcd734bc239be36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-azurestack \
python314-azure-mgmt-azurestack \
python3dist-azure-mgmt-azurestack"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
