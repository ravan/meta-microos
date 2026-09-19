SUMMARY = "Microsoft Azure Communication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Communication Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-mgmt-communication-3.0.0-1.1.noarch.rpm"
RPM_HASH = "790efeb052deb16cf01a0cb2530502c81f250ccb274688564623a590a7dc17f92ac3b066216839533697616359cb0890ed6b953bc330513a5b208e975b4f889e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-communication \
python314-azure-mgmt-communication \
python3dist-azure-mgmt-communication"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
