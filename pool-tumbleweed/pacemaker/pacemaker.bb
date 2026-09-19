SUMMARY = "Scalable High-Availability cluster resource manager"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
It supports more than 16 node clusters with significant capabilities \
for managing resources and dependencies. \
 \
It will run scripts at initialization, when machines go up or down, \
when related resources fail and can be configured to periodically check \
resource health."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.3+20260728.7052efa194"

RPM_NAME = "pacemaker-3.0.3+20260728.7052efa194-1.1.aarch64.rpm"
RPM_HASH = "e2ae1ab1adf2c7b45196d965d1e362dec375d5f86d25fb25fa54417600124c03a874586f907f2b070756ac1bb9d448c0f52f245daf5d927b201c5b8e8719d3f5"

RPROVIDES:${PN} += "pacemaker \
pacemaker-ticket-support"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
corosync \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfg.so.7 \
libcib.so.54 \
libcmap.so.4 \
libcpg.so.4 \
libcrmcluster.so.53 \
libcrmcommon.so.68 \
libcrmservice.so.53 \
libglib-2.0.so.0 \
libgnutls.so.30 \
liblrmd.so.52 \
libpacemaker.so.30 \
libpam.so.0 \
libpe-status.so.56 \
libqb.so.100 \
libstonithd.so.56 \
libxml2-tools \
libxml2.so.16 \
pacemaker-cli \
pacemaker-libs \
python3 \
resource-agents \
systemd"

inherit rpm
