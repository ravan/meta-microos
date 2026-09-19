SUMMARY = "Microsoft Azure Data Box Edge / Data Box Gateway Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Box Edge / Data Box Gateway Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python314-azure-mgmt-edgegateway-0.1.0-4.9.noarch.rpm"
RPM_HASH = "09fc129c0c456670d6e5722e8051424f0fd66b74e044484699296c39aa7bb9b4b58d146b8e20c537922689baf327e20d4f1feffc65c25ef53e212af71a0a5dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-edgegateway \
python314-azure-mgmt-edgegateway \
python3dist-azure-mgmt-edgegateway"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-msrestazure >= 0.4.32 with python314-msrestazure < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
