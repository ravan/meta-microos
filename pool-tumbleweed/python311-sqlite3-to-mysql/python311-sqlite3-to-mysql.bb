SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-sqlite3-to-mysql-2.4.0-1.3.noarch.rpm"
RPM_HASH = "b675dfd9c1535e62adb6be6a8fd2e56e01624268fccd7d539673cbfd7e0d7f90ffdafbbb4296a2a8cf2ba80bc54da7c927d65ea35ff9023f20c957b6413c5787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sqlite3-to-mysql \
python311-sqlite3-to-mysql \
python3dist-sqlite3-to-mysql"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-Unidecode \
python311-click \
python311-mysql-connector-python \
python311-packaging \
python311-python-dateutil \
python311-pytimeparse2 \
python311-simplejson \
python311-tabulate \
python311-tqdm \
python311-types-python-dateutil \
python311-typing-extensions"

inherit rpm
