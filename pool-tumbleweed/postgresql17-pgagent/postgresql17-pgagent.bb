SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.3"

RPM_NAME = "postgresql17-pgagent-4.2.3-2.3.aarch64.rpm"
RPM_HASH = "604dad6f6401485ae3f17e9fd7681ba198155c25ec08776d20ac8904efaa5bfb97b56d4d38d107d40adfd6fd39b24074e0704b044769b54b0a752d61511fec11"

RPROVIDES:${PN} += "config-postgresql17-pgagent \
postgresql17-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql17-server \
shadow \
systemd"

inherit rpm
