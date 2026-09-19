SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python313-mysql-to-sqlite3-2.6.0-1.2.noarch.rpm"
RPM_HASH = "7ac4a632f25eb4cd0ef0591cc5c7df6c1e77f05eeb6a86f4d81ec9077b084074f2f3b04c4b65d024b1a2d79fa91c22664353229997ae7db25c08c990b85c5d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mysql-to-sqlite3 \
python3.13dist-mysql-to-sqlite3 \
python313-mysql-to-sqlite3 \
python3dist-mysql-to-sqlite3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-mysql-connector-python \
python313-python-dateutil \
python313-python-slugify \
python313-pytimeparse2 \
python313-simplejson \
python313-tabulate \
python313-tqdm \
python313-types-python-dateutil \
python313-typing-extensions"

inherit rpm
