SUMMARY = "Microsoft Azure Resource Resource-Deploymentstacks Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Resource-Deploymentstacks Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-resource-deployments-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "9f9e6cb3469cde4e0ea9634b245ec7abcc3d86aade8f23bd02f617074fab60ccacef6938dca4186536f6f556f189d511eac7bb227413e57ffa624c8e4c870e67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource-deployments \
python3.13dist-azure-mgmt-resource-deployments \
python313-azure-mgmt-resource-deployments \
python3dist-azure-mgmt-resource-deployments"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-mgmt-resource \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
