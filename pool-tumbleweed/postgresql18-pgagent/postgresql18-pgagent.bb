SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.3"

RPM_NAME = "postgresql18-pgagent-4.2.3-2.3.aarch64.rpm"
RPM_HASH = "a0641d159197e60736ede430550be3e8a375fe9b1f289acad157bec8408572548dc89658aeafd8624740aabce78facc4673b7641540e8337f20d5bc3b995052b"

RPROVIDES:${PN} += "config-postgresql18-pgagent \
postgresql18-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql18-server \
shadow \
systemd"

inherit rpm
