SUMMARY = "Determine if shell has a light or dark background"
DESCRIPTION = "A python module to determine if a shell has a light or dark background."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "python314-term-background-1.0.5-1.2.noarch.rpm"
RPM_HASH = "f66ab7850ea3bf4f8a2b67309b2711997055008249e78776626bbec4a3ac6626dfd53548b2594bec13cb5f4610a2d5d8c7b023751b8f0ac5732024fca83777c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-term-background \
python314-term-background \
python3dist-term-background"

RDEPENDS:${PN} += "python-abi"

inherit rpm
