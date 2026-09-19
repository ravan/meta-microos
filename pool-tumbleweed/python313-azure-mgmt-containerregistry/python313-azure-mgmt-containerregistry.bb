SUMMARY = "Microsoft Azure Container Registry Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "15.1.0~b2"

RPM_NAME = "python313-azure-mgmt-containerregistry-15.1.0~b2-1.1.noarch.rpm"
RPM_HASH = "e9dcb89043b548b69723b44a02c1f4eb0addae6cd9e40406ffb7fe4fbf3c97a66444a85b62f42d8d7220968bf7bba2d307a280813fc3306f73aa322ec0208237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerregistry \
python3.13dist-azure-mgmt-containerregistry \
python313-azure-mgmt-containerregistry \
python3dist-azure-mgmt-containerregistry"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
