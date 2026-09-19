SUMMARY = "Microsoft Azure IoTHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "5.0.0~b2"

RPM_NAME = "python313-azure-mgmt-iothub-5.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "ce096325376d1e2b1ef0b5c5bda31508fc29b06a000cc5bfd350902bde9f3c721367cc70665157801d334255f6e639370d3f5f58f9bb7447d25d7bee670d073d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iothub \
python3.13dist-azure-mgmt-iothub \
python313-azure-mgmt-iothub \
python3dist-azure-mgmt-iothub"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.7.1 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
