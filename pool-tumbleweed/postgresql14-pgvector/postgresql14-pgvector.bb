SUMMARY = "Open-source vector similarity search for Postgres"
DESCRIPTION = "Store your vectors with the rest of your data. Supports: \
 \
exact and approximate nearest neighbor search \
L2 distance, inner product, and cosine distance \
any language with a Postgres client \
Plus ACID compliance, point-in-time recovery, JOINs, and all of the other great features of Postgres"
LICENSE = "PostgreSQL"

PV = "0.8.3"

RPM_NAME = "postgresql14-pgvector-0.8.3-1.3.aarch64.rpm"
RPM_HASH = "9551479d7d582b69af32bc372b85837fc279574912dfd07f36caae38b02fd236ca6e2644fe05faa74758e2d0d0f0e86cf39cb28bc66191659667248800eb13b3"

RPROVIDES:${PN} += "postgresql14-pgvector \
postgresql14-pgvector-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql14-server"

inherit rpm
