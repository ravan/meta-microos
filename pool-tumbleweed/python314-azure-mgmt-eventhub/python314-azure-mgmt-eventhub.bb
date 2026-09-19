SUMMARY = "Microsoft Azure EventHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python314-azure-mgmt-eventhub-12.0.0-1.1.noarch.rpm"
RPM_HASH = "2c5fa72be212fb3cbf4313c297dbedba8437b87676c8bf80f5a03d58e19699c52c319d51eb6b1b0a074a4e2ba055dc8f5f7d18452ccb5e8398fc9c7b36ecab9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-eventhub \
python314-azure-mgmt-eventhub \
python3dist-azure-mgmt-eventhub"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
