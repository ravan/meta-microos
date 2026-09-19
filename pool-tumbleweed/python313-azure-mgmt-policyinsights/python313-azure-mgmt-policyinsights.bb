SUMMARY = "Microsoft Azure Policy Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Policy Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b4"

RPM_NAME = "python313-azure-mgmt-policyinsights-1.1.0b4-2.9.noarch.rpm"
RPM_HASH = "d8913d49ee17ad0b692e15b28d724bf7403b8b509d97dd2d52238ce828741e3014c751298c4b5deaad79a3298011685637f44573af75cd545e214548ca68fcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-policyinsights \
python3.13dist-azure-mgmt-policyinsights \
python313-azure-mgmt-policyinsights \
python3dist-azure-mgmt-policyinsights"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
