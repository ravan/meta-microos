SUMMARY = "Microsoft Azure Defendereasm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Defendereasm Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-defendereasm-1.0.0~b1-2.9.noarch.rpm"
RPM_HASH = "aceb0f61875ea24fe860bb3d6ea44a0f8bdf76556ef1cf2faf76eec7b810dc977e979a6c18e3fa231727af156d5ed7e64160863642674c7674d10cb19b1183c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-defendereasm \
python314-azure-mgmt-defendereasm \
python3dist-azure-mgmt-defendereasm"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
