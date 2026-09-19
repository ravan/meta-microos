SUMMARY = "A DLZ module which stores zone data in an sqlite3 db"
DESCRIPTION = "This package provides the externally loadable SQLitee DLZ module, without \
update support."
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-modules-sqlite3-9.20.26-1.2.aarch64.rpm"
RPM_HASH = "b2410c369cdd95b4e28874593a72d8840e654662deae2a34a8fb5b2139a69ac36d6213c3bfd76ecbcee2093d64c8df2bf54af8df1316a4e2c7bbfecb559a6cbb"

RPROVIDES:${PN} += "bind-modules-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
