SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python314-sqlite3-to-mysql-2.6.0-1.2.noarch.rpm"
RPM_HASH = "93e8e678464099377b1bb8fa6131bacdc144f9bbfd50f66cc2c5f299330fa1e1887d89b61ea55afcdcf287882e8b05497ca2f7b24ffbf44a63582ab853d66a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlite3-to-mysql \
python314-sqlite3-to-mysql \
python3dist-sqlite3-to-mysql"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Unidecode \
python314-click \
python314-mysql-connector-python \
python314-packaging \
python314-python-dateutil \
python314-pytimeparse2 \
python314-simplejson \
python314-tabulate \
python314-tqdm \
python314-types-python-dateutil \
python314-typing-extensions"

inherit rpm
