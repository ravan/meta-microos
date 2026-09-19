SUMMARY = "Python interface to MySQL"
DESCRIPTION = "MySQLdb is an interface to the popular MySQL database server for Python. \
 \
This package adds Python 3 support and bug fixes to MySQLdb1."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.8"

RPM_NAME = "python313-mysqlclient-2.2.8-1.5.aarch64.rpm"
RPM_HASH = "1bbe0bf4f8fa5de1a058817fd7fe61876c7db9ccbe7d04fcbed535ade8d702244411cca1138dce9769fe763d33053004b5fadd0154f17c924d417fef3d98eed5"

RPROVIDES:${PN} += "python3-MySQL-python \
python3-mysql \
python3-mysqlclient \
python3.13dist-mysqlclient \
python313-MySQL-python \
python313-mysql \
python313-mysqlclient \
python3dist-mysqlclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
python-abi"

inherit rpm
