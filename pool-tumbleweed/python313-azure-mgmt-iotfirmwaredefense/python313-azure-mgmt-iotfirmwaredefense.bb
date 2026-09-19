SUMMARY = "Microsoft Azure Iotfirmwaredefense Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Iotfirmwaredefense Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-iotfirmwaredefense-2.0.0-1.4.noarch.rpm"
RPM_HASH = "b5ffdf88b8b38f0291968f79901a74fa7708a37f55056c4e2da46d7bb18b8ebefbbe9cdad1b66d38e0bd3a5cf6c209be8b172ad7b5fc9f5a991f36fd27734d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iotfirmwaredefense \
python3.13dist-azure-mgmt-iotfirmwaredefense \
python313-azure-mgmt-iotfirmwaredefense \
python3dist-azure-mgmt-iotfirmwaredefense"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
