SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python313-sqlite3-to-mysql-2.6.0-1.2.noarch.rpm"
RPM_HASH = "97f6a1980ed08d8fa0e4fd19598763170488d136e3eaaa6b5b40a211eabab372e89cc33b20f890779e9fc13d251c97cf1237d289d199d033d8e55b4599609da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite3-to-mysql \
python3.13dist-sqlite3-to-mysql \
python313-sqlite3-to-mysql \
python3dist-sqlite3-to-mysql"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Unidecode \
python313-click \
python313-mysql-connector-python \
python313-packaging \
python313-python-dateutil \
python313-pytimeparse2 \
python313-simplejson \
python313-tabulate \
python313-tqdm \
python313-types-python-dateutil \
python313-typing-extensions"

inherit rpm
