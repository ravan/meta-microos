SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python314-panflute-2.3.1-1.10.noarch.rpm"
RPM_HASH = "358900ae3656133cd1d3152dc4b9b4baabc5dd512a8f774f2ffd5f13467c190c2111e08e374f6b1bb239851436b9ecc1880148dd1e8d4cab687797f8cba637bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-panflute \
python314-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-click \
update-alternatives"

inherit rpm
