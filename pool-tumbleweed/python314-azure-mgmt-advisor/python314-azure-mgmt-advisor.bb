SUMMARY = "Microsoft Azure Advisor Client Library"
DESCRIPTION = "This is the Microsoft Azure Advisor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python314-azure-mgmt-advisor-9.0.1-1.2.noarch.rpm"
RPM_HASH = "5ae9bbc5242b61aa9e301d7b1316995be85de3271690863935d9fdad07749767e35c833a03a03293060da17a31526c8446a98e67428c3aaf6d93dc2f9ee584b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-advisor \
python314-azure-mgmt-advisor \
python3dist-azure-mgmt-advisor"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
