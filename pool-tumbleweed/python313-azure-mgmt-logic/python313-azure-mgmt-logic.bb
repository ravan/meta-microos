SUMMARY = "Microsoft Azure Logic Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Logic Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python313-azure-mgmt-logic-10.0.0-2.9.noarch.rpm"
RPM_HASH = "03705d0ed348d4c49277e85d120d525955a9b4bac10191c2bcf8bf30c6d0444524a928a287611a663ab612ddc097c96517a63356708ee58f2fd019ea881f1ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-logic \
python3.13dist-azure-mgmt-logic \
python313-azure-mgmt-logic \
python3dist-azure-mgmt-logic"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
