SUMMARY = "Open-source vector similarity search for Postgres"
DESCRIPTION = "Store your vectors with the rest of your data. Supports: \
 \
exact and approximate nearest neighbor search \
L2 distance, inner product, and cosine distance \
any language with a Postgres client \
Plus ACID compliance, point-in-time recovery, JOINs, and all of the other great features of Postgres"
LICENSE = "PostgreSQL"

PV = "0.8.3"

RPM_NAME = "postgresql15-pgvector-0.8.3-1.3.aarch64.rpm"
RPM_HASH = "e50b02293a6db7487e3a5ca0acb1e07e84f221dbd5ec37c9a6e8ee9e12eaa61426c3f4f7cce94958d82d354e03b826ffda97d49c03dea90b901b4e32e996a7c8"

RPROVIDES:${PN} += "postgresql15-pgvector \
postgresql15-pgvector-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
