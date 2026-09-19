SUMMARY = "GOG download module for Heroic Games Launcher"
DESCRIPTION = "GOG Downloading module for Heroic Games Launcher"
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "heroic-gogdl-1.3.0-1.1.noarch.rpm"
RPM_HASH = "ce331200470da7774499e6eb8ab243a0ea296e6591b30e859a58b7c2646f255bf6165136c86fbe6088a0871d478ebeb8503ef42e5d37f1d7f16ed60bfc97266d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "heroic-gogdl \
python3.13dist-gogdl \
python3dist-gogdl"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-requests \
xdelta3"

inherit rpm
