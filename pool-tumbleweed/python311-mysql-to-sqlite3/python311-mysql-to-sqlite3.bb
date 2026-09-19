SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python311-mysql-to-sqlite3-2.4.1-1.3.noarch.rpm"
RPM_HASH = "b3d09ce30d43dfc79f68e63886bba5a2a62360b43d483af85bfdb5c2bf193213c155e9fe86394bbd17bb37d31a8ddaa37638e851f45cb11859eeb13c75422a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mysql-to-sqlite3 \
python311-mysql-to-sqlite3 \
python3dist-mysql-to-sqlite3"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-click \
python311-mysql-connector-python \
python311-python-dateutil \
python311-python-slugify \
python311-pytimeparse2 \
python311-simplejson \
python311-tabulate \
python311-tqdm \
python311-types-python-dateutil \
python311-typing-extensions"

inherit rpm
