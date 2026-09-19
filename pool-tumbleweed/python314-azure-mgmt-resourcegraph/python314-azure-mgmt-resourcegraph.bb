SUMMARY = "Microsoft Azure Resource Graph Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Graph Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "python314-azure-mgmt-resourcegraph-8.0.1-1.4.noarch.rpm"
RPM_HASH = "422005a7c1fff49cb5af00588c303e5fc3183b73dd47e7e0e7fa5add04015356a31839c18584fd65d01e9ea6498c19b5abcbc0459d8860e635a0cb900793414f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resourcegraph \
python314-azure-mgmt-resourcegraph \
python3dist-azure-mgmt-resourcegraph"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.7.1 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
