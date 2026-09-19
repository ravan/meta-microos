SUMMARY = "Microsoft Azure SAP Hana on Azure Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SAP Hana on Azure Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-hanaonazure-1.0.1-1.2.noarch.rpm"
RPM_HASH = "886d1847d6a7f7fa8ca3e652c622257cb8e95739615a0ec4033a776984d7f2d90ef27eae48b98cd0c4ee58e6d621599035d4329cceaf1d5e380e76ed0b1f0828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hanaonazure \
python3.13dist-azure-mgmt-hanaonazure \
python313-azure-mgmt-hanaonazure \
python3dist-azure-mgmt-hanaonazure"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
