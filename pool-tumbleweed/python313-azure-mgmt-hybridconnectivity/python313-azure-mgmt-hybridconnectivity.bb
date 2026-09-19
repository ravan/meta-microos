SUMMARY = "Microsoft Azure Hybridconnectivity Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridconnectivity Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-hybridconnectivity-1.0.0-2.9.noarch.rpm"
RPM_HASH = "dfb9cd31d24eb0ca7eaeb97ae1e82617bb086345965b9c44a4ea4b9a1ecfaad43e96687f41560e38f68f077ac54acb483ee6ae4bd39526fed78ddf3d3e8667f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridconnectivity \
python3.13dist-azure-mgmt-hybridconnectivity \
python313-azure-mgmt-hybridconnectivity \
python3dist-azure-mgmt-hybridconnectivity"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
