SUMMARY = "Microsoft Azure Consumption Client Library"
DESCRIPTION = "This is the Microsoft Azure Consumption Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.0"

RPM_NAME = "python313-azure-mgmt-consumption-11.0.0-1.1.noarch.rpm"
RPM_HASH = "e2c8b992f7845fa7f38dad4aade77a8358517dce72b4a1a35f65994e121ae9310a771c45c810d00b5e01161cd8b9e768191cafe1318f04df482a2073e6b484bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-consumption \
python3.13dist-azure-mgmt-consumption \
python313-azure-mgmt-consumption \
python3dist-azure-mgmt-consumption"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
