SUMMARY = "Pacemaker remote executor daemon for non-cluster nodes"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-remote package contains the Pacemaker Remote daemon \
which is capable of extending pacemaker functionality to remote \
nodes not running the full corosync/cluster stack."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.3+20260728.7052efa194"

RPM_NAME = "pacemaker-remote-3.0.3+20260728.7052efa194-1.1.aarch64.rpm"
RPM_HASH = "897536f07e9a1696c671f047235438ead85d0d8ddf4a2f76dbf147f569160684bb212e8ae1b7afd501d3bc124cdef4f758a6f269b48e781efb59813b64c3bacd"

RPROVIDES:${PN} += "pacemaker-remote"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcib.so.54 \
libcrmcommon.so.68 \
libcrmservice.so.53 \
libglib-2.0.so.0 \
libgnutls.so.30 \
liblrmd.so.52 \
libqb.so.100 \
libstonithd.so.56 \
pacemaker-cli \
pacemaker-libs \
resource-agents \
systemd"

inherit rpm
