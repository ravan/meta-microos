SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
DESCRIPTION = "pyelftools is a pure python library for analyzing ELF files and DWARF debugging information"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "0.33"

RPM_NAME = "python314-pyelftools-0.33-1.1.noarch.rpm"
RPM_HASH = "66d8a6c48aa1d8c7afd627913cb5c2335db414e0a7883b6b45f67c0f75c429a0ed8dd9e4ef4a617433694e5c69947e47bb2b9688d0a68440816d3557304e804e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyelftools \
python314-pyelftools \
python3dist-pyelftools"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
