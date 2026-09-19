SUMMARY = "Redland storage module for PostgresSQL"
DESCRIPTION = "This store provides storage using the PostgreSQL open source database \
including contexts."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "redland-storage-postgresql-1.0.17-6.8.aarch64.rpm"
RPM_HASH = "b1541b9b0ccc6a845afea327c0e4be6cc9cc18a13b554edcdb42fb1be0d9045535e47969374ba0888378c5841d4091355f791026b2a297e266ae56e22ea30efb"

RPROVIDES:${PN} += "librdf-storage-postgresql.so \
redland-storage-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
librdf.so.0 \
redland"

inherit rpm
