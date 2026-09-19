SUMMARY = "Microsoft Azure Alerts Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Alerts Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-alertsmanagement-1.0.1-1.2.noarch.rpm"
RPM_HASH = "fc1bfb40691124844efad8c993f89b06e80acdb7c3606fd2a38fd21f76b9273ad3c27c845289883e55a7867adbdf460966ff3e877af5aac917b2604c93b629f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-alertsmanagement \
python314-azure-mgmt-alertsmanagement \
python3dist-azure-mgmt-alertsmanagement"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
