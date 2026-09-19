SUMMARY = "MS Azure Servicefabricmanagedclusters Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicefabricmanagedclusters Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-servicefabricmanagedclusters-3.0.0-1.2.noarch.rpm"
RPM_HASH = "be1998c44cf8cce77eb6ced515fcf902c56f0055b3ec7470bc3326056333ba68645eb3135d3e0996c8b3d73e5f1b77e1ee424f5a91772e96a9a222a96f7e11d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicefabricmanagedclusters \
python3.13dist-azure-mgmt-servicefabricmanagedclusters \
python313-azure-mgmt-servicefabricmanagedclusters \
python3dist-azure-mgmt-servicefabricmanagedclusters"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
