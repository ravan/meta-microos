SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-mgmt-databoxedge-3.0.0-1.1.noarch.rpm"
RPM_HASH = "c33b704e22fd2e3c535c29738dd889f5c5d29bcbda4bcffbe53f0e90ce6f8f6cb04b4ed03f0fa9231c5cdb0e9ce5074e7b9a21762e725a50f261d0dbec688c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-databoxedge \
python314-azure-mgmt-databoxedge \
python3dist-azure-mgmt-databoxedge"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-isodate \
python314-typing-extensions"

inherit rpm
