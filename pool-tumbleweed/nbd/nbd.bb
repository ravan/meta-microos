SUMMARY = "Network Block Device Server and Client Utilities"
DESCRIPTION = "This package contains nbd-server. It is the server backend for the nbd \
network block device driver that's in the Linux kernel. \
 \
nbd can be used to have a filesystem stored on another machine. It does \
provide a block device, not a file system; so unless you put a \
clustering filesystem on top of it, you can't access it simultaneously \
from more than one client. Use NFS or a real cluster FS (such as \
ocfs2) if you want to do this. nbd-server can export a file (which may \
contain a filesystem image) or a partition. Swapping over nbd is \
possible as well, though it's said not to be safe against OOM and \
should not be used for that case. nbd-server also has a copy-on-write \
mode where changes are saved to a separate file and thrown away when \
the connection closes. \
 \
The package also contains the nbd-client tools, which you need to \
configure the nbd devices on the client side."
LICENSE = "GPL-2.0-or-later"

PV = "3.27.1"

RPM_NAME = "nbd-3.27.1-2.3.aarch64.rpm"
RPM_HASH = "86611257ba1172a9ab8ed791de91dc742497a824e80b0b6c72d824878ea365e2bc682e955456764810b2cba95f2ac6ea2eaeec47878096c24b38d0e4b3155354"

RPROVIDES:${PN} += "config-nbd \
nbd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
systemd"

inherit rpm
