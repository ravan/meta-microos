SUMMARY = "Microsoft Azure Log Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "14.0.0"

RPM_NAME = "python314-azure-mgmt-loganalytics-14.0.0-1.2.noarch.rpm"
RPM_HASH = "3c16dc28942307fce845116496245767c8d4802b970a156b5739f616a605d624aecb2ef483820d4a1c4f052c3ff8000431e4ca5851d6c3ec176bc31812cd39c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-loganalytics \
python314-azure-mgmt-loganalytics \
python3dist-azure-mgmt-loganalytics"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
