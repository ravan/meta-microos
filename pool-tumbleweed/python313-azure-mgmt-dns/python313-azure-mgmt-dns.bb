SUMMARY = "Microsoft Azure DNS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python313-azure-mgmt-dns-9.0.0-1.5.noarch.rpm"
RPM_HASH = "92b2bb1f97f24894c497206e1b7dd2ade77c2a082bf858da285b16a3a3f930068948c8aeb84c701cb0048bdc369c28ca734a28f73ef590dc8eb3717d1a862f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dns \
python3.13dist-azure-mgmt-dns \
python313-azure-mgmt-dns \
python3dist-azure-mgmt-dns"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.5.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
