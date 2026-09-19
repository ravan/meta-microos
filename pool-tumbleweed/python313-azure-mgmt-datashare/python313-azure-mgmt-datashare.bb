SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-datashare-1.0.1-1.2.noarch.rpm"
RPM_HASH = "2aba24cdc1751e4ee7de8050f5beb0d2aaf88fa87c05e627ead80caa515bc363e3520d2766dcefdd9587c33177f5f2af9d14c7ded3343dd3c1f8e939e268da57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datashare \
python3.13dist-azure-mgmt-datashare \
python313-azure-mgmt-datashare \
python3dist-azure-mgmt-datashare"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
