SUMMARY = "Microsoft Azure Log Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-azure-loganalytics-0.1.1-3.9.noarch.rpm"
RPM_HASH = "fec674cc3a8776547d557bbf322a89235d5d760de594b2765c847c144bc3a9ad98e9f2a9cfe2a09a4b68d7a5caea2555975490b394bd6688f1011fa33ded5ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-loganalytics \
python314-azure-loganalytics \
python3dist-azure-loganalytics"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest"

inherit rpm
