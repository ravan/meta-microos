SUMMARY = "Microsoft Azure Computefleet Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computefleet Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-computefleet-1.0.0-1.9.noarch.rpm"
RPM_HASH = "dded6ea04a119ebb72ee7e055e823a75201eaa1e9bb020142d83a6a3d4cf6d3a74098458f4726e2af425917ca9bcbdc6f8de13b63acd4bb28f7aa931ea8da9a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-computefleet \
python314-azure-mgmt-computefleet \
python3dist-azure-mgmt-computefleet"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
