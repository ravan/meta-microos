SUMMARY = "Open-source vector similarity search for Postgres"
DESCRIPTION = "Store your vectors with the rest of your data. Supports: \
 \
exact and approximate nearest neighbor search \
L2 distance, inner product, and cosine distance \
any language with a Postgres client \
Plus ACID compliance, point-in-time recovery, JOINs, and all of the other great features of Postgres"
LICENSE = "PostgreSQL"

PV = "0.8.3"

RPM_NAME = "postgresql17-pgvector-0.8.3-1.3.aarch64.rpm"
RPM_HASH = "f27d8356eef4ae882eac782fb540c2f9267d810c99b6ed3e5b602092d53e498bc7ad3317a7ed2fb8df96ecd422137a29f500b3c0c4e11bc4fe169cc2336bd036"

RPROVIDES:${PN} += "postgresql17-pgvector \
postgresql17-pgvector-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql17-server"

inherit rpm
