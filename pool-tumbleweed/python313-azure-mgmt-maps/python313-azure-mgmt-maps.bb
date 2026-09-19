SUMMARY = "Microsoft Azure Maps Client Library"
DESCRIPTION = "This is the Microsoft Azure Maps Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-maps-2.1.0-2.9.noarch.rpm"
RPM_HASH = "031a7d309c0800e364f62376b727252acd0db2eb804473f88dddc05923566f55854ff8e691b3a2b33ebc55a6ca3ae0a97a5303959b0c5fe6aea8d33c347a96a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-maps \
python3.13dist-azure-mgmt-maps \
python313-azure-mgmt-maps \
python3dist-azure-mgmt-maps"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
