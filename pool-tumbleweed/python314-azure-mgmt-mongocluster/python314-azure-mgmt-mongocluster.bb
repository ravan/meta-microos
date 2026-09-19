SUMMARY = "Microsoft Azure Mongocluster Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mongocluster Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-azure-mgmt-mongocluster-1.2.0-1.1.noarch.rpm"
RPM_HASH = "6363b1c86298071d1e4bdb1dfa2cee51a0deb4dcb8ed94e6b2f31318228ac76cbf1ef9265a91e68ed56dfb0129ca990234664ed8687915a357ef50bc8628308d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-mongocluster \
python314-azure-mgmt-mongocluster \
python3dist-azure-mgmt-mongocluster"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
