SUMMARY = "Microsoft Azure DevTestLabs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DevTestLabs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python313-azure-mgmt-devtestlabs-9.0.1-1.2.noarch.rpm"
RPM_HASH = "fbc77dfe1af0349d96b18bc9ad394b8bb1258df732d4456809cef731c13e59d3991554d84386ead40b2e99073d335381929ce54c17869394caa71b435c8de7c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devtestlabs \
python3.13dist-azure-mgmt-devtestlabs \
python313-azure-mgmt-devtestlabs \
python3dist-azure-mgmt-devtestlabs"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
