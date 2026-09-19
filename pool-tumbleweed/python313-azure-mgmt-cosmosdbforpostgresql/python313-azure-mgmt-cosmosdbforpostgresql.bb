SUMMARY = "Microsoft Azure Cosmosdbforpostgresql Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cosmosdbforpostgresql Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-cosmosdbforpostgresql-1.0.0-2.9.noarch.rpm"
RPM_HASH = "877961fc493cef99b1fbb18bdd6d1b66b32c9adfd915bd4c27ab3628f31639fe624f80a6ab7f38a303c7fa5b9de28a0af7efda7586eea7a237e0899aa7212965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cosmosdbforpostgresql \
python3.13dist-azure-mgmt-cosmosdbforpostgresql \
python313-azure-mgmt-cosmosdbforpostgresql \
python3dist-azure-mgmt-cosmosdbforpostgresql"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
