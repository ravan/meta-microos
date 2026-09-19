SUMMARY = "Microsoft Azure Cosmosdbforpostgresql Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cosmosdbforpostgresql Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-cosmosdbforpostgresql-1.0.0-2.9.noarch.rpm"
RPM_HASH = "fefbf611a46931cdbd12226faf51c48a11130c1a06e98b9b7da723333458990f38ad9d15eb446937d8f083d71c35b771aa30911d5d1ef3f3f122e1d78ed2c5e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-cosmosdbforpostgresql \
python314-azure-mgmt-cosmosdbforpostgresql \
python3dist-azure-mgmt-cosmosdbforpostgresql"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
