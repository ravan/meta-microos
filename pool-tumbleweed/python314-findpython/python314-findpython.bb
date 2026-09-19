SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python314-findpython-0.8.0-1.2.noarch.rpm"
RPM_HASH = "681f325f07008d53b0395b0a064b3969f6afb0d942ad6779682bf99a4b8861e196f6f1f82d6b60599fd5563491dd8aeb3bc26c3e4777ad6713c1f9b980ecd605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-findpython \
python314-findpython \
python3dist-findpython"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-packaging \
python314-platformdirs \
update-alternatives"

inherit rpm
