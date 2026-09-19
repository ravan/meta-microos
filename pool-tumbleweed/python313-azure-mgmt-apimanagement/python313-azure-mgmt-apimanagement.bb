SUMMARY = "Microsoft Azure API Management Client Library"
DESCRIPTION = "This is the Microsoft Azure API Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python313-azure-mgmt-apimanagement-5.0.0-1.5.noarch.rpm"
RPM_HASH = "06e7dff01beb8b78026e7ffd920adaa0b8205ee753c27abc1e659791c92c35b50dee2ea0aeff0f1a4e51c6a8e766d95d5cec63dabfca7cefc28da9486ba57f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-apimanagement \
python3.13dist-azure-mgmt-apimanagement \
python313-azure-mgmt-apimanagement \
python3dist-azure-mgmt-apimanagement"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
