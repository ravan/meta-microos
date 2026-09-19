SUMMARY = "Microsoft Azure Data Box Edge / Data Box Gateway Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Box Edge / Data Box Gateway Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python313-azure-mgmt-edgegateway-0.1.0-4.9.noarch.rpm"
RPM_HASH = "7bc9dbb91fbd1d7e4ead4ae582228eac9acd658d3af022424611dde403bf01919d6b3574e3a3fab0d1ab59bbb075edd28faed6279adf57de5ffd7504e5b10222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-edgegateway \
python3.13dist-azure-mgmt-edgegateway \
python313-azure-mgmt-edgegateway \
python3dist-azure-mgmt-edgegateway"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-msrestazure >= 0.4.32 with python313-msrestazure < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
