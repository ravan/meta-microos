SUMMARY = "Microsoft Azure Managedops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managedops Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-managedops-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "f8082bd333c6605b382ea68d3cf1e10fd25942df268a5c3c0c2414518ba9a744da802e5b4f90468f66179caf7a80e9da5fdb0fb2970d6d13b71ee442ad6c8b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managedops \
python3.13dist-azure-mgmt-managedops \
python313-azure-mgmt-managedops \
python3dist-azure-mgmt-managedops"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
