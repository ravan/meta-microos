SUMMARY = "Microsoft Azure Computerecommender Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computerecommender Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-computerecommender-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "1e65098b9f3dd784062da75b0b0c7ef61ae16dc4d3930f53bd172dd384721a5bfd183085f819f685c639d9a81b1fee968733aa9b783cfd6e6dd8fc858386cf58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-computerecommender \
python314-azure-mgmt-computerecommender \
python3dist-azure-mgmt-computerecommender"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
