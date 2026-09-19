SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0~b2"

RPM_NAME = "python314-azure-mgmt-authorization-5.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "d6a7897c9c45e1a992eba1f3d14458d9e519561cf09b995585506514bf562e2a288cbc0d0e9b6a01c3c04da914740f4c627e2787f320c5dbd1254164740103ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-authorization \
python314-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
