SUMMARY = "Microsoft Azure Automation Client Library"
DESCRIPTION = "This is the Microsoft Azure Automation Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0b2"

RPM_NAME = "python313-azure-mgmt-automation-1.1.0b2-2.9.noarch.rpm"
RPM_HASH = "a45e60469d4b30ad2cfa7ef6064c3749ac1f7f50f8e544c923f4810b97af6961d625b3eecc6c9151eb0f16e04814fabeb6ebd9bef0491fad53109176633e899a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-automation \
python3.13dist-azure-mgmt-automation \
python313-azure-mgmt-automation \
python3dist-azure-mgmt-automation"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.1 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
