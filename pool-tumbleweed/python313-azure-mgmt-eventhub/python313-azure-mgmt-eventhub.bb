SUMMARY = "Microsoft Azure EventHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python313-azure-mgmt-eventhub-12.0.0-1.1.noarch.rpm"
RPM_HASH = "fa61a9d8187613696ed048bdc75cffef2997cae993f6123557217e6633175d24c4ef8d7090840e3cf44fa33d3f1b6ebce610dbde903a06c580147ace2b271eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-eventhub \
python3.13dist-azure-mgmt-eventhub \
python313-azure-mgmt-eventhub \
python3dist-azure-mgmt-eventhub"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
