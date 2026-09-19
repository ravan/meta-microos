SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "8.0.4"

RPM_NAME = "python314-python-slugify-8.0.4-3.5.noarch.rpm"
RPM_HASH = "517572c9a72ad52f513d1286d5f9bef2476d958b09c2607b275ee4f2b32789abf24a15a46c6035c8e06755f23eb51a1251c6ccbbd76ed2fff462ec5f07cbec1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-slugify \
python314-python-slugify \
python3dist-python-slugify"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-text-unidecode"

inherit rpm
