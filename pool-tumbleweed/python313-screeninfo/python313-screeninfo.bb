SUMMARY = "Fetch location and size of physical screens"
DESCRIPTION = "Python module to fetch location and size of physical screens."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python313-screeninfo-0.8.1-1.15.noarch.rpm"
RPM_HASH = "f1695260f56e87e2b6441b3b33a560bf42c6cd6913b43952e9788f1352c831b9e23614ef396803f6f29665147e9150ebcafbca626f5ed2b44f0166d38d9309d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-screeninfo \
python3.13dist-screeninfo \
python313-screeninfo \
python3dist-screeninfo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
