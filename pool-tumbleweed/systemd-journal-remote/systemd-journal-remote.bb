SUMMARY = "Gateway for serving journal events over the network using HTTP"
DESCRIPTION = "This extends the journal functionality to keep a copy of logs on a \
remote server by providing programs to forward journal entries over \
the network, using encrypted HTTP, and to write journal files from \
serialized journal contents. \
 \
This package contains systemd-journal-gatewayd, \
systemd-journal-remote, and systemd-journal-upload."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-journal-remote-261.2-1.2.aarch64.rpm"
RPM_HASH = "bbf215bda5e708963ecfa5526c8999c8f42b68a59cb7066f03ec19ed08ef6643a3c3045005b5535eedb318c1456eb63e2f73c47bc0bce7bf6fb306b6bf40cd2a"

RPROVIDES:${PN} += "group-systemd-journal-remote \
systemd-journal-remote \
user-systemd-journal-remote"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-261.2-1.2.so \
systemd"

inherit rpm
