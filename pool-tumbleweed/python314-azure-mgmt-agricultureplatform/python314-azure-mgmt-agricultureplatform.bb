SUMMARY = "Microsoft Azure Agricultureplatform Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agricultureplatform Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-agricultureplatform-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "5082bdab8a69ca691ef4535c89a81191aa8e1006518dc381c1a5ce159eb7aa344d548da635838b8ba3960ca2b3a066d689612889baa8e3fb8905c39c1324d2aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-agricultureplatform \
python314-azure-mgmt-agricultureplatform \
python3dist-azure-mgmt-agricultureplatform"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
