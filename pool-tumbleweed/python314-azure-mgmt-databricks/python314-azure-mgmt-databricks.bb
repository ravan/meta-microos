SUMMARY = "Microsoft Azure Databricks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Databricks Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-mgmt-databricks-3.0.0-1.1.noarch.rpm"
RPM_HASH = "9aa4603f191ef1c9d24ab79ac9727e85e428b1034fdec1474f15c0a9b9d8d85f8d0bb73150a3baddda4c83be4bf3fe730f24f6ebcd437876575da43ae127f4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-databricks \
python314-azure-mgmt-databricks \
python3dist-azure-mgmt-databricks"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
