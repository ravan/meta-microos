SUMMARY = "Microsoft Azure Planetarycomputer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Planetarycomputer Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-planetarycomputer-1.0.0-1.2.noarch.rpm"
RPM_HASH = "cafda7283a84c46be18ecd56970baea8b8f70649f7ea0b96960348302b8154f39ba442b336c64a22cd1fe43050b8f1e33e875e532195ec28c5a51e9bfb857237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-planetarycomputer \
python314-azure-mgmt-planetarycomputer \
python3dist-azure-mgmt-planetarycomputer"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
