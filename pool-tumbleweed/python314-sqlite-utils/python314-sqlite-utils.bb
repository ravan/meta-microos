SUMMARY = "Python CLI tool and library for manipulating SQLite databases"
DESCRIPTION = "CLI tool and Python utility functions for manipulating SQLite databases."
LICENSE = "Apache-2.0"

PV = "3.39"

RPM_NAME = "python314-sqlite-utils-3.39-1.3.noarch.rpm"
RPM_HASH = "3c028ed0d8b152bdc17ed9c3ad582e8c2074c0e8391f5a103fceff91aa54d93d371ee97a9a6725401798e3b36a8218b10f8c6241b6338b441fd194ef1ea0506f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlite-utils \
python314-sqlite-utils \
python3dist-sqlite-utils"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-click-default-group \
python314-pluggy \
python314-python-dateutil \
python314-sqlite-fts4 \
python314-tabulate \
update-alternatives"

inherit rpm
