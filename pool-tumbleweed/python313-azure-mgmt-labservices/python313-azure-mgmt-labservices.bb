SUMMARY = "Microsoft Azure Lab Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Lab Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-labservices-2.0.0-2.9.noarch.rpm"
RPM_HASH = "806f696384167465b05cebe69f40aeeb9e42b76600f1846d7255208d110b94c7074c043525f7d00a75d3b91d3a3159124dd3d2e07e9f2b3a346aec9418261303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-labservices \
python3.13dist-azure-mgmt-labservices \
python313-azure-mgmt-labservices \
python3dist-azure-mgmt-labservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
