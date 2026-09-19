SUMMARY = "Microsoft Azure Managednetworkfabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managednetworkfabric Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-managednetworkfabric-2.0.0-1.2.noarch.rpm"
RPM_HASH = "109341fd0866de1bf1bf6b532292a918bf7216906cefce52182bbd1f7d85d1f98913b8fbc040172e8dfff537c83cd73a88b72b9d05a8ab2b5f06d8c85df60629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-managednetworkfabric \
python314-azure-mgmt-managednetworkfabric \
python3dist-azure-mgmt-managednetworkfabric"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
