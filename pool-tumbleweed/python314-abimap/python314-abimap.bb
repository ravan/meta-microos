SUMMARY = "A helper for library maintainers to use symbol versioning"
DESCRIPTION = "This script allows to generate and update symbol version linker scripts which \
adds version information to the exported symbols. The script is intended to be \
integrated as part of a shared library build to check for changes in the set of \
exported symbols and update the symbol version linker script accordingly."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-abimap-0.4.0-1.5.noarch.rpm"
RPM_HASH = "d701034eb835a819c78c10bd17477295e12f920ae4a7295a5591216f4bd3125883bd779753b96c53ca4f2ad96f0c9d4e162f50e569b03fc5b211376cc9aa811a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-abimap \
python314-abimap \
python3dist-abimap"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
