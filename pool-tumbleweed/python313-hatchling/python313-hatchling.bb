SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "python313-hatchling-1.32.0-1.1.noarch.rpm"
RPM_HASH = "776acdc0dcbc9578081b5df07113cefa3831e0ca5ca77f30a5b83e5a5776475325dd7ec6deb8d8a305d7a6e91de1212a3997b945a4aba39e2ffde8795d0daa62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatchling \
python3.13dist-hatchling \
python313-hatchling \
python3dist-hatchling"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging \
python313-pathspec \
python313-pluggy \
python313-tomlkit \
python313-trove-classifiers"

inherit rpm
