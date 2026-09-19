SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0~b2"

RPM_NAME = "python313-azure-mgmt-authorization-5.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "df96154c0e756f4cd47dd67aba91fd881976598018d150b6ac61c62b5634c45fcfa2ec118af04f8a7eeea8dbbf18598d4b2f0e7d1c6bb951cf862a820a26be37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-authorization \
python3.13dist-azure-mgmt-authorization \
python313-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
