SUMMARY = "Microsoft Azure IoTHub Provisioning Services Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Provisioning Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-iothubprovisioningservices-1.1.0-3.9.noarch.rpm"
RPM_HASH = "14a2b21d4fe4917ebf871687a6001ac0cfe5b9ef1daee083e1a03d5e97e0bfa47173733b415288f8873c08903c08f2012d97505dc225a689999e88dbe945855e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iothubprovisioningservices \
python3.13dist-azure-mgmt-iothubprovisioningservices \
python313-azure-mgmt-iothubprovisioningservices \
python3dist-azure-mgmt-iothubprovisioningservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
