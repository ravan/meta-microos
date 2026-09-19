SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python313-azure-mgmt-cosmosdb-10.0.0-1.1.noarch.rpm"
RPM_HASH = "0df99481a37b28b28780d85ecea4eea1007a649f1f9ea4ddf01bd3cd452b6b5e1f7bb8680a601b5383973a27dbcf62bf865736e1a8f816869e83ab8a348b7246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cosmosdb \
python3.13dist-azure-mgmt-cosmosdb \
python313-azure-mgmt-cosmosdb \
python3dist-azure-mgmt-cosmosdb"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
