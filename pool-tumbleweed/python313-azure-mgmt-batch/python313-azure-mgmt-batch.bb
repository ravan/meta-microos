SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "19.0.0"

RPM_NAME = "python313-azure-mgmt-batch-19.0.0-1.3.noarch.rpm"
RPM_HASH = "0e8353f9b688dd65922f97d45379c69f3fe6f59a8815b0680fd16e7d2a2f8dd81e6c817bc29772fe47b0e9eca0397ee29144aff5ba3b341f0dfe088d8a6cf9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-batch \
python3.13dist-azure-mgmt-batch \
python313-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
