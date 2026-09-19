SUMMARY = "Microsoft Azure Resource Bicep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Bicep Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-resource-bicep-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "f24b73d5ebe01c4ce6aba250c5c3d20b77b8780f0e5f35d5af2bf44929c15dd2d0efc623e086354c4ba846381260b7cd59afb2d7638f369add2cea490efc24f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource-bicep \
python3.13dist-azure-mgmt-resource-bicep \
python313-azure-mgmt-resource-bicep \
python3dist-azure-mgmt-resource-bicep"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-mgmt-resource \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
