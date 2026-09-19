SUMMARY = "Microsoft Azure Deployment Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Deployment Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-deploymentmanager-1.0.0.0-3.9.noarch.rpm"
RPM_HASH = "4c6aaf6127ebec4e205c498bff613227c2d86c8f040b4c973a6ddc91c86104da0f834816e791371b9ddeb77234f8190e70e2fba42c334052a66b315a582608b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-deploymentmanager \
python314-azure-mgmt-deploymentmanager \
python3dist-azure-mgmt-deploymentmanager"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
