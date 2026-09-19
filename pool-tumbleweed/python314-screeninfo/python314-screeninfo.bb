SUMMARY = "Fetch location and size of physical screens"
DESCRIPTION = "Python module to fetch location and size of physical screens."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python314-screeninfo-0.8.1-1.15.noarch.rpm"
RPM_HASH = "2400ba41f9695ecf0dc27f65c4c7eb53693d2b1df69266529d521ad35afd4445a774a8a677ae033af86650546ede9a1039577d77e9f07a5249d59191e0fe7a7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-screeninfo \
python314-screeninfo \
python3dist-screeninfo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
