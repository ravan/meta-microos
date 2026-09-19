SUMMARY = "Microsoft Azure Policy Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Policy Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b4"

RPM_NAME = "python314-azure-mgmt-policyinsights-1.1.0b4-2.9.noarch.rpm"
RPM_HASH = "97ab07f302d55a9fd8cb1919c2e3f1a2ffa90c8fb9a94fef79e94c7c9274d047b8a4cb55c0e4e1ddd885472d24eb59fe81c9c8e01fee41668fd50b66183a072a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-policyinsights \
python314-azure-mgmt-policyinsights \
python3dist-azure-mgmt-policyinsights"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
