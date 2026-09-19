SUMMARY = "C++ Client Library for PostgreSQL"
DESCRIPTION = "This package contains header files needed for writing \
C++ programs that connect to a PostgreSQL database."
LICENSE = "BSD-3-Clause"

PV = "7.10.3"

RPM_NAME = "libpqxx-devel-7.10.3-1.4.aarch64.rpm"
RPM_HASH = "cf8c82c58269ce68cdc71182d1154781f47469a05d6083bff8fe2fc572371801c67a785f6860f6c263d78c2295f80005c90190093ca9619ee807a1c2d9f9ddc3"

RPROVIDES:${PN} += "cmake-libpqxx \
libpqxx-devel \
pkgconfig-libpqxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc-c++ \
libpqxx-7-10 \
pkgconfig-libpq"

inherit rpm
