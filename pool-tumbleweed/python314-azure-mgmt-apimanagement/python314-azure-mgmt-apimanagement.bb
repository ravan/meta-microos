SUMMARY = "Microsoft Azure API Management Client Library"
DESCRIPTION = "This is the Microsoft Azure API Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python314-azure-mgmt-apimanagement-5.0.0-1.5.noarch.rpm"
RPM_HASH = "fba1560cdecafbf363bd4aac2e8f60d47d66fa89ac6f8a867e8d4b8cc1af87e5c9140c61796e9e65c1f28e873505a8f853aadb36fb2fe260661dc8c7da2c5688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-apimanagement \
python314-azure-mgmt-apimanagement \
python3dist-azure-mgmt-apimanagement"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
