SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.3"

RPM_NAME = "postgresql16-pgagent-4.2.3-2.3.aarch64.rpm"
RPM_HASH = "3c5ef57b163f49eda5714d0d2718bfbd08c90c3aed288b34691181e05d3a0e2eb40ee11eafd17face357c08963021645af148ad1d801931dfa990c08ea746cfb"

RPROVIDES:${PN} += "config-postgresql16-pgagent \
postgresql16-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql16-server \
shadow \
systemd"

inherit rpm
