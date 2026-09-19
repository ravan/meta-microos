SUMMARY = "Pytest plugin for testing ASDF schemas"
DESCRIPTION = "Pytest plugin for testing ASDF schemas"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python313-pytest-asdf-plugin-0.2.0-1.1.noarch.rpm"
RPM_HASH = "93a5df119c6965814bea3e38880263ab47998b6691e9fd4b6372d3d3ed75f2321c3c8d2d8aea63e19efd5f3c6566b5ea957cd517db3e906daa475587bcdd034f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-asdf-plugin \
python3.13dist-pytest-asdf-plugin \
python313-pytest-asdf-plugin \
python3dist-pytest-asdf-plugin"

RDEPENDS:${PN} += "python-abi \
python313-asdf \
python313-pytest"

inherit rpm
