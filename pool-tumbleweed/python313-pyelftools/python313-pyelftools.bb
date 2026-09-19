SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
DESCRIPTION = "pyelftools is a pure python library for analyzing ELF files and DWARF debugging information"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "0.33"

RPM_NAME = "python313-pyelftools-0.33-1.1.noarch.rpm"
RPM_HASH = "c1e39b5a8bfbe82bf2f2195356a38c5c9d1f9e3040715b905837ce02ceccae28a682d6c6d21106df7d3e5c40741bb6684c9dd4b7c53dc69cf7379217c15cf116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyelftools \
python3.13dist-pyelftools \
python313-pyelftools \
python3dist-pyelftools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
