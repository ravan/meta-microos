SUMMARY = "Microsoft Azure Deployment Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Deployment Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-deploymentmanager-1.0.0.0-3.9.noarch.rpm"
RPM_HASH = "cbdcd426c8ef3f9d7c933dcaebeb8c578bcb106af7c84dac1c383d534fdefde0da428faca6495bb86911939e3e56e1f985c06a8b8a405075130423f7a5a67d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-deploymentmanager \
python3.13dist-azure-mgmt-deploymentmanager \
python313-azure-mgmt-deploymentmanager \
python3dist-azure-mgmt-deploymentmanager"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
