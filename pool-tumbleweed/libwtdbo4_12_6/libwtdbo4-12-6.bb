SUMMARY = "Wt::Dbo ORM library and Sqlite3 back-end"
DESCRIPTION = "This package contains the Wt::Dbo Object-Relational Mapping library \
and Sqlite3 back-end of it."
LICENSE = "GPL-2.0-only"

PV = "4.12.6"

RPM_NAME = "libwtdbo4_12_6-4.12.6-1.4.aarch64.rpm"
RPM_HASH = "bb9178e79edc4caa5ec1c6683e147b4a08a34b210b929ec1a1d076c40706e34684f1caea47c90fe708d617d5051b90a3ab7cc3fb380c7ec4560b1b33899201a6"

RPROVIDES:${PN} += "libwtdbo.so.4.12.6 \
libwtdbo4-12-6 \
libwtdbosqlite3.so.4.12.6 \
wt-dbo"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
