SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.29"

RPM_NAME = "python314-versioneer-0.29-3.1.noarch.rpm"
RPM_HASH = "1e0274649c2896c1832dea3bcdd1fb1e213143dafc0e2e104179a6832cad9f3bf3ad8727b2fdc96db177fb74416421ef2cc72adcf2e63b7b0e71109692c104ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-versioneer \
python314-versioneer \
python3dist-versioneer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
