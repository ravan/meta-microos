SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.3"

RPM_NAME = "postgresql15-pgagent-4.2.3-2.3.aarch64.rpm"
RPM_HASH = "d5a5c286b92d2e4e78eeae7625183e1c73dbf501d0697a3a36e13549e87a4add0c5de4db1a93a2bee800b3eb1c9e865d8e216c8606a3d55ae5ed06fbfac0dd3a"

RPROVIDES:${PN} += "config-postgresql15-pgagent \
postgresql15-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql15-server \
shadow \
systemd"

inherit rpm
