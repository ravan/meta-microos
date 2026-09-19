SUMMARY = "Headers and sources for SQLiteCpp, a C++ SQLite wrapper"
DESCRIPTION = "This package provides the headers and sources for developing against SQLiteCpp."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "SQLiteCpp-devel-3.3.3-2.4.aarch64.rpm"
RPM_HASH = "bf7156a8ce66724e1d141a1a67dc3bac5822e069ef96dc6b5b787044d51f4536dbb7dc276faa8f5f437ed97078269e339e00c46353a83945b2dc7d63f82beebf"

RPROVIDES:${PN} += "SQLiteCpp-devel \
cmake-SQLiteCpp \
pkgconfig-sqlitecpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsqlitecpp0 \
pkgconfig-sqlite3"

inherit rpm
