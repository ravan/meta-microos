SUMMARY = "Microsoft Azure Iotoperations Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Iotoperations Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-azure-mgmt-iotoperations-1.2.0-1.1.noarch.rpm"
RPM_HASH = "c61da95c389455525f0120c4a6bee8c5636d3aae17724a9ac0617a1fc1c5299f7051b957814a7094301dceec011c1db0c514536cc448dff18b8d7fd5111b97a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-iotoperations \
python314-azure-mgmt-iotoperations \
python3dist-azure-mgmt-iotoperations"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
