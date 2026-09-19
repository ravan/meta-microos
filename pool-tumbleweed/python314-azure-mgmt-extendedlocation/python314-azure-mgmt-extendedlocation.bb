SUMMARY = "Microsoft Azure Extendedlocation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Extendedlocation Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-extendedlocation-2.0.0-1.9.noarch.rpm"
RPM_HASH = "cc7ee0f4c84a089051aaf6249e8ce1a92ad4c63bdb5feb8c102cb3d1134739087b59bf46a7e91c144b80c57a5b16c3f33b2f26c3e14b576c12e00340d2a92180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-extendedlocation \
python314-azure-mgmt-extendedlocation \
python3dist-azure-mgmt-extendedlocation"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
