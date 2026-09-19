SUMMARY = "Microsoft Azure IoTHub Provisioning Services Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Provisioning Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-iothubprovisioningservices-1.1.0-3.9.noarch.rpm"
RPM_HASH = "1f83dc795a8e6a6797bef48e05ab659f90fafb939a267d9d1a6e53dd503d822b673a67fe6cf1545806b63ab5c8b74db623d2865f171bd3943b6485212f2a7847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-iothubprovisioningservices \
python314-azure-mgmt-iothubprovisioningservices \
python3dist-azure-mgmt-iothubprovisioningservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
