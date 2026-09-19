SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-azure-mgmt-vmwarecloudsimple-0.2.0-4.9.noarch.rpm"
RPM_HASH = "06b151e16940ff0c05390d2fa3bd7d427c123349dab4c39f1c91814a8d033a7515264ec2adc5485fe23fb219e8e107ba50502d69398eb67df157601c5a23780a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-vmwarecloudsimple \
python3.13dist-azure-mgmt-vmwarecloudsimple \
python313-azure-mgmt-vmwarecloudsimple \
python3dist-azure-mgmt-vmwarecloudsimple"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-msrestazure >= 0.4.32 with python313-msrestazure < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
