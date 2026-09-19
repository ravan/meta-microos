SUMMARY = "SQLite plugin for tntdb"
DESCRIPTION = "SQLite plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-sqlite-1.4-1.22.aarch64.rpm"
RPM_HASH = "8cfd3798b29b3e4ecfcff9d2d732809a7bf2474ea76634a07e53f8faad1dbaa34c914c0d8ec6634d2061232fd135159630215b6a4f38010b7efc3b667b8d07ca"

RPROVIDES:${PN} += "tntdb-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
