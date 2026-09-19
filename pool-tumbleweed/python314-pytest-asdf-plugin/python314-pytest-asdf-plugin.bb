SUMMARY = "Pytest plugin for testing ASDF schemas"
DESCRIPTION = "Pytest plugin for testing ASDF schemas"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python314-pytest-asdf-plugin-0.2.0-1.1.noarch.rpm"
RPM_HASH = "3612252ca20811de98b09dd48b1d554e538865784a018f8e3f658d231b62881b2b5c8b51837761a44246794bcdc8c203aee4c5f49e841cd3cf50c43eb625a1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-asdf-plugin \
python314-pytest-asdf-plugin \
python3dist-pytest-asdf-plugin"

RDEPENDS:${PN} += "python-abi \
python314-asdf \
python314-pytest"

inherit rpm
