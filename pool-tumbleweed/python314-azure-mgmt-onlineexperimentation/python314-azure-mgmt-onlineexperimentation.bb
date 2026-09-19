SUMMARY = "Microsoft Azure Onlineexperimentation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Onlineexperimentation Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-onlineexperimentation-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "02634c3cda5a686707e8b3fb183ef7ff86fdfb62b06ffc4f0fecbe4a09d0f09d8c20a96766a8e64ad99ec0b37425777893eafb4021e2f9419c6438a53593a64e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-onlineexperimentation \
python314-azure-mgmt-onlineexperimentation \
python3dist-azure-mgmt-onlineexperimentation"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
