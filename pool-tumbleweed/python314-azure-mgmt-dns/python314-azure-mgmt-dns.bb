SUMMARY = "Microsoft Azure DNS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python314-azure-mgmt-dns-9.0.0-1.5.noarch.rpm"
RPM_HASH = "65cfcc2c6be043ac0cf91eaaf79f7b6ea72062f0863e7b1bf0613676e5157b90a513501879ead472ba4d0b817a948af28b100fe81317de53b5a163932a1666e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-dns \
python314-azure-mgmt-dns \
python3dist-azure-mgmt-dns"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.5.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
