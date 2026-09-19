SUMMARY = "Microsoft Azure IoTHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "5.0.0~b2"

RPM_NAME = "python314-azure-mgmt-iothub-5.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "22fac8474e3ee44f79b3af887ee72fd5b8e9bbbf281f78b9317efffd939c4229b6b80ad43a7d3a1d5d7a891e16fc2c77578161587dc7870153bd0fbc587330d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-iothub \
python314-azure-mgmt-iothub \
python3dist-azure-mgmt-iothub"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.7.1 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
