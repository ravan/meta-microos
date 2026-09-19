SUMMARY = "Microsoft Azure Bot Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Bot Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0.0"

RPM_NAME = "python313-azure-mgmt-botservice-2.0.0.0-2.9.noarch.rpm"
RPM_HASH = "e41fc40dfeaf6b120897f5695137b1e3528364da5cd62cc9d9ddd832a66b510d99ec3c59a94282157fc276480b778e7906a0d80918a8993d8049c26cf321727b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-botservice \
python3.13dist-azure-mgmt-botservice \
python313-azure-mgmt-botservice \
python3dist-azure-mgmt-botservice"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
