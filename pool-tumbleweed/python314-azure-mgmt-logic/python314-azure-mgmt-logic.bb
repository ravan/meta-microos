SUMMARY = "Microsoft Azure Logic Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Logic Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python314-azure-mgmt-logic-10.0.0-2.9.noarch.rpm"
RPM_HASH = "85b2822e2e842812d5f3242bb06b9b48ff88f5dfeb9ed72cc2ebd5d6213714260eb5ed602e55604315a310bddb1381997a669a438be5fa29674ed48e917e3738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-logic \
python314-azure-mgmt-logic \
python3dist-azure-mgmt-logic"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
