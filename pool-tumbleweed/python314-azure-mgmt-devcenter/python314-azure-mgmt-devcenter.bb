SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-devcenter-1.1.0-1.9.noarch.rpm"
RPM_HASH = "108d66ce78906ef1ca166a94771f3e02bffc9d0292b96fe9350fcc9a28568501b4f1b4a95f1f3af6a9c3133819b35f399b61c6008e14f1458de64dede22d2843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-devcenter \
python314-azure-mgmt-devcenter \
python3dist-azure-mgmt-devcenter"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
