SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "19.0.0"

RPM_NAME = "python314-azure-mgmt-batch-19.0.0-1.3.noarch.rpm"
RPM_HASH = "9a07e0c647ef50cbd34a5614dbb381feadac0ee73367cec8fe7b4503b1a72ad5fae00a8da7d6b1bf72771ae0a7d3fb2c217913a87db21a0cf9bc455fc6a42818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-batch \
python314-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
