SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "41.6.0"

RPM_NAME = "python313-azure-mgmt-containerservice-41.6.0-1.1.noarch.rpm"
RPM_HASH = "fc01e75b169454d9b9935975275f60680b51000c34b548437bcfe73c0f08983e4dfeee6318354cfe8a3f76fb4633c0cb9bdcd9bb8a75c450b8b345562aaf6943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerservice \
python3.13dist-azure-mgmt-containerservice \
python313-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
