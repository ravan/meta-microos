SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries"
DESCRIPTION = "Dictdiffer is a library that helps you to diff and patch dictionaries."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-dictdiffer-0.9.0-5.5.noarch.rpm"
RPM_HASH = "3f6ea602bf193f1336a1de01d298eb41f89bc70e2a08f1022135970161f5088d426887cc2eefab12d0d0d899ad8276b6c5829a1c9b8f83b0b24f6a629f3c03ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dictdiffer \
python314-dictdiffer \
python3dist-dictdiffer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
