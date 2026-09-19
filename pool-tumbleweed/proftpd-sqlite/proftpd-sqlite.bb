SUMMARY = "SQLite Module for ProFTPD"
DESCRIPTION = "This is the SQLite Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-sqlite-1.3.9c-2.1.aarch64.rpm"
RPM_HASH = "6e475743e01b338b6ab0b87a930f4399ea93b16e2cb0a29a122ab5543c700755c25460e54ff150daa831ce7bfa8ff7310d6317f3e5439fb7c7af3e41fc4f01c6"

RPROVIDES:${PN} += "proftpd-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
proftpd"

inherit rpm
