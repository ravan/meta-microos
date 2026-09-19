SUMMARY = "Microsoft Azure Billing Client Library"
DESCRIPTION = "This is the Microsoft Azure Billing Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python313-azure-mgmt-billing-8.0.0-1.2.noarch.rpm"
RPM_HASH = "88bdacb40658490ac92d017b4f472b797f6fb63f5bd085030d44183b70cb48514697e7e517d28c352e89c47c1ee131fb0e2cd506352226846c3201ada9d128e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-billing \
python3.13dist-azure-mgmt-billing \
python313-azure-mgmt-billing \
python3dist-azure-mgmt-billing"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
