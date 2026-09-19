SUMMARY = "A Kernel-Based Automounter"
DESCRIPTION = "AutoFS is a kernel-based automounter for Linux.  It automatically \
mounts filesystems when you use them, and unmounts them later when \
you are not using them.  This can include network filesystems, CD-ROMs, \
floppies, and so forth."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.9"

RPM_NAME = "autofs-5.1.9-11.6.aarch64.rpm"
RPM_HASH = "9c46302f26d67847adb8fb58fd4db06be0b76b63f90029d1874ddb79eb2f7b4e3886e7854b1e968bd68e0ee3ca26ceff3e7b57e2b6b29f2de0d7928bf4b67176"

RPROVIDES:${PN} += "autofs \
config-autofs \
libautofs.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
aaa-base \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libdbus-1.so.3 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libresolv.so.2 \
libsasl2.so.3 \
libsystemd.so.0 \
libtirpc.so.3 \
libxml2.so.16"

inherit rpm
