SUMMARY = "Microsoft Azure Mongodbatlas Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mongodbatlas Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-mongodbatlas-1.0.0-1.5.noarch.rpm"
RPM_HASH = "7a2c99c0e3a4326be9a5d7d5c7d4fe8241f73f4716582bc95c26476591a2b3adcc09b7180e2406489b8caca43e8c6a2227d181db56068baf0316a98c9a6c20fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mongodbatlas \
python3.13dist-azure-mgmt-mongodbatlas \
python313-azure-mgmt-mongodbatlas \
python3dist-azure-mgmt-mongodbatlas"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
