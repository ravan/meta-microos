SUMMARY = "Embeddable, replicated and fault tolerant SQL engine"
DESCRIPTION = "cowsql is a C library that implements an embeddable and replicated SQL database \
engine with high availability and automatic failover. \
 \
cowsql extends SQLite with a network protocol that can connect together various \
instances of your application and have them act as a highly-available cluster, \
with no dependency on external databases. \
 \
This package contains the share library."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "1.15.9"

RPM_NAME = "libcowsql0-1.15.9-2.3.aarch64.rpm"
RPM_HASH = "94bf2d24467dd7fe2f92da8891e39f4c03a5aaa012de71ea64c15dc34f23bd5abbd353433912a42aa2c645f401e3dcb7a8f6252aea9139de1b15a2e93ef02279"

RPROVIDES:${PN} += "libcowsql.so.0 \
libcowsql0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libraft.so.0 \
libsqlite3.so.0 \
libuv.so.1"

inherit rpm
