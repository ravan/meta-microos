SUMMARY = "Microsoft Azure Dashboard Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dashboard Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-dashboard-2.0.0-1.3.noarch.rpm"
RPM_HASH = "9f30887e5d917e732353b5740858c9467e1e018a76508391a7f23ddf689332ce9c341ff50f7c504c5af0030ae5c3a0b6587d2ff9eeccab97f6c1c262f1830b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-dashboard \
python314-azure-mgmt-dashboard \
python3dist-azure-mgmt-dashboard"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
