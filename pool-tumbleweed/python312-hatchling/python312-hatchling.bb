SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "python312-hatchling-1.32.0-1.1.noarch.rpm"
RPM_HASH = "9e911e7bc1997bda72385394e6bf40f1d1286ae3363fddd15908fcf6692376a11259c34e5880a9be77ca31cfbac17e6889c4ca3b67c5fee11787b08885a28ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-hatchling \
python312-hatchling \
python3dist-hatchling"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi \
python312-packaging \
python312-pathspec \
python312-pluggy \
python312-tomlkit \
python312-trove-classifiers"

inherit rpm
