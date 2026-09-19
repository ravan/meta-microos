SUMMARY = "Development files for the MariaDB Connector C API"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.9"

RPM_NAME = "libmariadb-devel-3.4.9-2.1.aarch64.rpm"
RPM_HASH = "e6d963d6251d06fa478dbb1390ae93bfe114c6d72f941ba501399bb717f006246e03589cc24b9488d25352941486d0885e6e78874fc9943650055a5edb6ddd5f"

RPROVIDES:${PN} += "libmariadb-devel \
libmysqlclient-devel \
mysql-devel \
pkgconfig-libmariadb \
pkgconfig-mysqlclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb3 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
