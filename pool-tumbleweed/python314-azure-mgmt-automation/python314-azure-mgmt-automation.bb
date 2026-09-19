SUMMARY = "Microsoft Azure Automation Client Library"
DESCRIPTION = "This is the Microsoft Azure Automation Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0b2"

RPM_NAME = "python314-azure-mgmt-automation-1.1.0b2-2.9.noarch.rpm"
RPM_HASH = "762a3ada76eeca087e29d72ea69989e9b3308c39d685c96c40b7b3e9ecf5ea7e2f8afe6516aa8ef388eec7a96df185f77f3b6088eb6e964d56096bac0b1dbfed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-automation \
python314-azure-mgmt-automation \
python3dist-azure-mgmt-automation"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.1 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
