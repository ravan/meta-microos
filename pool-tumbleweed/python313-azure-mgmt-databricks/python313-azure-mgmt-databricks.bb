SUMMARY = "Microsoft Azure Databricks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Databricks Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-databricks-3.0.0-1.1.noarch.rpm"
RPM_HASH = "26d63a652147c802600228519ab3793eb3792c9186471817254a9a3f540eb0b23a7559848837b55063ed2e960aef453db1535260c6f9edd3449ecf61cd39f649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databricks \
python3.13dist-azure-mgmt-databricks \
python313-azure-mgmt-databricks \
python3dist-azure-mgmt-databricks"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
