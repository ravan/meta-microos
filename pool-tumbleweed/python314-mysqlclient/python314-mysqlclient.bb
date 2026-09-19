SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.8"

RPM_NAME = "python314-mysqlclient-2.2.8-1.5.aarch64.rpm"
RPM_HASH = "b7f262001c6737949a13f190034615a9a3051f0fbbb3cba7642de6766c70db1b39054024c573c3db5ba4c6a6f135b40374ee71b7f6ef08033b5af6634dff92cb"

RPROVIDES:${PN} += "python3.14dist-mysqlclient \
python314-MySQL-python \
python314-mysql \
python314-mysqlclient \
python3dist-mysqlclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
python-abi"

inherit rpm
