SUMMARY = "Microsoft Azure Image Builder Client Library"
DESCRIPTION = "This is the Microsoft Azure Image Builder Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-imagebuilder-2.0.0-1.2.noarch.rpm"
RPM_HASH = "a4bd7101a93361b67d044f4939024233455d6a1c4a86e180abab0f8f62c8080d739b5b222eb36b33246db66518f1d1898d7e015db8db105e9179d5d05ab3b52a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-imagebuilder \
python314-azure-mgmt-imagebuilder \
python3dist-azure-mgmt-imagebuilder"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
