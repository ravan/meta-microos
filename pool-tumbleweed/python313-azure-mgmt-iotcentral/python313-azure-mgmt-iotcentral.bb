SUMMARY = "Microsoft Azure IoTCentral Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTCentral Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0b2"

RPM_NAME = "python313-azure-mgmt-iotcentral-10.0.0b2-2.9.noarch.rpm"
RPM_HASH = "2c3d52a2e8783942484f11cb9cf76142c5357fa043bf8309c66a7ff4a285f4f9ffc1570b21fe3302a3b0a59a1fb035edc2b07e4db789a46334307d87253b9dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iotcentral \
python3.13dist-azure-mgmt-iotcentral \
python313-azure-mgmt-iotcentral \
python3dist-azure-mgmt-iotcentral"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-msrest"

inherit rpm
