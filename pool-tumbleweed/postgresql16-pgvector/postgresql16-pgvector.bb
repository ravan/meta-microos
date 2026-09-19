SUMMARY = "Open-source vector similarity search for Postgres"
DESCRIPTION = "Store your vectors with the rest of your data. Supports: \
 \
exact and approximate nearest neighbor search \
L2 distance, inner product, and cosine distance \
any language with a Postgres client \
Plus ACID compliance, point-in-time recovery, JOINs, and all of the other great features of Postgres"
LICENSE = "PostgreSQL"

PV = "0.8.3"

RPM_NAME = "postgresql16-pgvector-0.8.3-1.3.aarch64.rpm"
RPM_HASH = "58c640fbed33e389b71335b03162f8b2e92e07298cb20e0f78f430da59aabe5a77717bbea37076cd6a6d4acc534a1e5529f0cabcf52737fe07eb217ac26435c7"

RPROVIDES:${PN} += "postgresql16-pgvector \
postgresql16-pgvector-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql16-server"

inherit rpm
