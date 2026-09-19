SUMMARY = "Microsoft Azure Data Factory Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Factory Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.3.0"

RPM_NAME = "python313-azure-mgmt-datafactory-9.3.0-1.3.noarch.rpm"
RPM_HASH = "3a4d6c9fb615942349ad517ac2f1ca8b92cbb18b72a78d0a5edb04ad045c81b6b8a6e4ebe55dcc6a88c959479476d265aaaf8bc289fd110df59a0631c651c088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datafactory \
python3.13dist-azure-mgmt-datafactory \
python313-azure-mgmt-datafactory \
python3dist-azure-mgmt-datafactory"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
