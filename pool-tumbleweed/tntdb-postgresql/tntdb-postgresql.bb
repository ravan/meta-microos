SUMMARY = "PostgreSQL plugin for tntdb"
DESCRIPTION = "PostgreSQL plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-postgresql-1.4-1.22.aarch64.rpm"
RPM_HASH = "4cc0f09e9b728bd73b88fdd37dd26e9cc9cc14f0b9e96293fbc39780b958c5c5b0b64837f4a50ccb99360068bfdff89e70f0fc70a6ead558117de84197bf568b"

RPROVIDES:${PN} += "tntdb-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
