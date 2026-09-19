SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "python314-hatchling-1.32.0-1.1.noarch.rpm"
RPM_HASH = "3437fe80d09a9fe479153a6f45c0f04f841ba1dee1099490db72e5638fb926981742a7aad033541f5c32f55679356322e9b320ae1524107225a585dc3b6e9074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatchling \
python314-hatchling \
python3dist-hatchling"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging \
python314-pathspec \
python314-pluggy \
python314-tomlkit \
python314-trove-classifiers"

inherit rpm
