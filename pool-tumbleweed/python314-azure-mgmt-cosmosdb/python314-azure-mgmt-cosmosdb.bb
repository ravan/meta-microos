SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python314-azure-mgmt-cosmosdb-10.0.0-1.1.noarch.rpm"
RPM_HASH = "7c7aecd5b01d1ae72b15270f79ed109a1cd7bc0a278b1fbfa7a679981f43e415ec44c9c32d0dd2fb44ef0a902b0f1d86cb82a6090df995ee713aca99a7ad6a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-cosmosdb \
python314-azure-mgmt-cosmosdb \
python3dist-azure-mgmt-cosmosdb"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
