SUMMARY = "Microsoft Azure Purestorageblock Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purestorageblock Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-purestorageblock-1.0.0-1.5.noarch.rpm"
RPM_HASH = "d9bee4e7c0e1a499cbd033d3c8be6f1ac0c5d729c85644a509912beb3c34ba5215a303d6e2489fb62c9f252208f4d2e82f1746584cdff89d41d9cf6100ece9fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-purestorageblock \
python3.13dist-azure-mgmt-purestorageblock \
python313-azure-mgmt-purestorageblock \
python3dist-azure-mgmt-purestorageblock"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
