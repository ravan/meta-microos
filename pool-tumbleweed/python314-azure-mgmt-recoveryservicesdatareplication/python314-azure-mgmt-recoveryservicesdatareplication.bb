SUMMARY = "MS Azure Recoveryservicesdatareplication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicesdatareplication Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-recoveryservicesdatareplication-1.0.0-1.4.noarch.rpm"
RPM_HASH = "0e3f2036a5b1afe02f53e3bdad1bae2ff60b9c860f5aaaee180f528a6590dabfb947225d8b24d575e047b17d96191eabf07f4b95804eba7dd001fbeae91eac9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-recoveryservicesdatareplication \
python314-azure-mgmt-recoveryservicesdatareplication \
python3dist-azure-mgmt-recoveryservicesdatareplication"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
