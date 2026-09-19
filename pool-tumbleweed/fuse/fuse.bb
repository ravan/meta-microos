SUMMARY = "Reference implementation of the 'Filesystem in Userspace'"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
This package contains helper programs for using FUSE mounts. \
 \
FUSE file systems are typically implemented as a standalone \
applications in their own right and are packaged separately."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-2.9.9-8.6.aarch64.rpm"
RPM_HASH = "92314af8f1aa8cb5b300c0a44d1cc822bf35834f1a43edc80b0f5f34b2ac706d9ac362e50e0435f599a68fc741f973abaa765f603a03e1eafe19e67295dbe259"

RPROVIDES:${PN} += "config-fuse \
fuse"

RDEPENDS:${PN} += "/usr/bin/sh \
group-trusted \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
util-linux"

inherit rpm
