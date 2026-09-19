SUMMARY = "Microsoft Azure Postgresqlflexibleservers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Postgresqlflexibleservers Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "3.0.0~b2"

RPM_NAME = "python314-azure-mgmt-postgresqlflexibleservers-3.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "a4570661152522ae9dea562ac4211cb70abbb2c27f253eb87862df6bdd9376173a21023e1c23bf9845ccb509a27561234d4f27555af4e61022ac6a95eabac3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-postgresqlflexibleservers \
python314-azure-mgmt-postgresqlflexibleservers \
python3dist-azure-mgmt-postgresqlflexibleservers"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
