SUMMARY = "SQLite plugin for tntdb"
DESCRIPTION = "Replication plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-replicate-1.4-1.22.aarch64.rpm"
RPM_HASH = "2d05796b765890e9c4e0e6c8106005c8501f09c6618852c0ca302f5f561a45d154766db5987c9c4794de0899b02eef5fa53f2d48e174a5b102c7cbb4e10ca757"

RPROVIDES:${PN} += "tntdb-replicate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
