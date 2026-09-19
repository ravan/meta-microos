SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python314-mysql-to-sqlite3-2.6.0-1.2.noarch.rpm"
RPM_HASH = "787d7c5898c1369893ba8c773095654662197abf7815fd551fe40c59b6c7cc7ada39123b22287a1ed4382f23dd9ffa586cdd8ff34b3d05ad484d091b85b70ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mysql-to-sqlite3 \
python314-mysql-to-sqlite3 \
python3dist-mysql-to-sqlite3"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-mysql-connector-python \
python314-python-dateutil \
python314-python-slugify \
python314-pytimeparse2 \
python314-simplejson \
python314-tabulate \
python314-tqdm \
python314-types-python-dateutil \
python314-typing-extensions"

inherit rpm
