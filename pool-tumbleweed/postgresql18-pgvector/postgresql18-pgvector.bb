SUMMARY = "Open-source vector similarity search for Postgres"
DESCRIPTION = "Store your vectors with the rest of your data. Supports: \
 \
exact and approximate nearest neighbor search \
L2 distance, inner product, and cosine distance \
any language with a Postgres client \
Plus ACID compliance, point-in-time recovery, JOINs, and all of the other great features of Postgres"
LICENSE = "PostgreSQL"

PV = "0.8.3"

RPM_NAME = "postgresql18-pgvector-0.8.3-1.3.aarch64.rpm"
RPM_HASH = "512854689b90ce0fa563e418adca0617ad4fcec9714423b551581c96647a1fae9f0530f44ae01c4b2dc6f44d4805e6608ba7afe3a618d396dd89f1fdf878c6a0"

RPROVIDES:${PN} += "postgresql18-pgvector \
postgresql18-pgvector-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql18-server"

inherit rpm
