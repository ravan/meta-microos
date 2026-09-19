SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "libfuse2-2.9.9-8.6.aarch64.rpm"
RPM_HASH = "95a3622f44f0dd6efa3ece4537cf0a989ac83c7b55df45a9946dba0b6767ace4e2564577079523d299d2f31c4eb9be12b67dc1d9bd6890245104fde5983865ce"

RPROVIDES:${PN} += "libfuse.so.2 \
libfuse2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
