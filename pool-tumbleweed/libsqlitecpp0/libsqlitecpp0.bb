SUMMARY = "C++ wrapper for SQLite3"
DESCRIPTION = "This package provides the shared library for SQLiteCpp."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "libsqlitecpp0-3.3.3-2.4.aarch64.rpm"
RPM_HASH = "316ba76fd352dfb578286f2edaeaaf08ee6c0e478a6a8ce43a86dddf61965fcdff98aea9753002a68719d09630f610d4a83ff993c7bc4f4462b38b86f1f000e7"

RPROVIDES:${PN} += "libsqlitecpp.so.0 \
libsqlitecpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
