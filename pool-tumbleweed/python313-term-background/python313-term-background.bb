SUMMARY = "Determine if shell has a light or dark background"
DESCRIPTION = "A python module to determine if a shell has a light or dark background."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "python313-term-background-1.0.5-1.2.noarch.rpm"
RPM_HASH = "c51c596678fae07148dedd52c80433ce29afe03f8ac3ef501542471177d91cf61e84726c372d1462f4e22594e35457ac75b4b753b513de2449ab815654f674d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-term-background \
python3.13dist-term-background \
python313-term-background \
python3dist-term-background"

RDEPENDS:${PN} += "python-abi"

inherit rpm
