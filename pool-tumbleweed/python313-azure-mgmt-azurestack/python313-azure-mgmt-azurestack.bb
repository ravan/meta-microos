SUMMARY = "Microsoft Azure AzureStack Management Client Library"
DESCRIPTION = "This is the Microsoft Azure AzureStack Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-azurestack-1.0.1-1.2.noarch.rpm"
RPM_HASH = "25ecc949ac18d388d5c3185478802f5ef7df3e3cee309f7685497cb9c89adf8592e0b3cb423cf070f5e7cfbaaf54f8ccc564b110aebee5416cffe096fd069e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurestack \
python3.13dist-azure-mgmt-azurestack \
python313-azure-mgmt-azurestack \
python3dist-azure-mgmt-azurestack"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
