SUMMARY = "Microsoft Azure Postgresqlflexibleservers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Postgresqlflexibleservers Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "3.0.0~b2"

RPM_NAME = "python313-azure-mgmt-postgresqlflexibleservers-3.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "c27ad23d7063733d720a6dff9929e973bc506185aa6b9563be3423b1d11a1a8ce152a3710c51773ed6fd8e6c33181c49c5c292e6b0b8033a9c733f71f58b0f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-postgresqlflexibleservers \
python3.13dist-azure-mgmt-postgresqlflexibleservers \
python313-azure-mgmt-postgresqlflexibleservers \
python3dist-azure-mgmt-postgresqlflexibleservers"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
