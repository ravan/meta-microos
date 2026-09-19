SUMMARY = "Microsoft Azure Service Bus Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0~b1"

RPM_NAME = "python314-azure-mgmt-servicebus-10.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "72cffc1dbfb36e5980ec135065dca3731ed7ca8562ee3fc9c54e4528baa1c875105bf7a35546e32380a29f9dfdee1572e7111917ed40e7fbdf99176e5d549233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-servicebus \
python314-azure-mgmt-servicebus \
python3dist-azure-mgmt-servicebus"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
