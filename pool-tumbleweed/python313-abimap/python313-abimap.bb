SUMMARY = "A helper for library maintainers to use symbol versioning"
DESCRIPTION = "This script allows to generate and update symbol version linker scripts which \
adds version information to the exported symbols. The script is intended to be \
integrated as part of a shared library build to check for changes in the set of \
exported symbols and update the symbol version linker script accordingly."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-abimap-0.4.0-1.5.noarch.rpm"
RPM_HASH = "64dc90a33505360be627bb1e254ebf74b3277b7fd3e7000c2e5a6207b29deb4d7ce575828ec3a2fc51d9c2509d2aa60dbca93a8a354c5506461fd1823264aac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abimap \
python3.13dist-abimap \
python313-abimap \
python3dist-abimap"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
