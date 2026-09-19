SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.3"

RPM_NAME = "postgresql14-pgagent-4.2.3-2.3.aarch64.rpm"
RPM_HASH = "f0cddf13487b8074ad12c5ce7896d234618a8c8fadc6405c603d79ebb9880177fa6219bb0956d139597c089be1e7e00cad29de557792bdf2a246aa646c6192dc"

RPROVIDES:${PN} += "config-postgresql14-pgagent \
postgresql14-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql14-server \
shadow \
systemd"

inherit rpm
