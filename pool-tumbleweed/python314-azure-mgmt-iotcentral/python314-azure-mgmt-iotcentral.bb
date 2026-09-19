SUMMARY = "Microsoft Azure IoTCentral Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTCentral Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0b2"

RPM_NAME = "python314-azure-mgmt-iotcentral-10.0.0b2-2.9.noarch.rpm"
RPM_HASH = "f57511a14e9182d46666abe8c6079b8ee9724c63571c1dd1330c3ede02b485a1d06ee2e39dd20b4b77f484d681e3e9e527c7350a214c16b4f68a0ca4825b2651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-iotcentral \
python314-azure-mgmt-iotcentral \
python3dist-azure-mgmt-iotcentral"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-msrest"

inherit rpm
