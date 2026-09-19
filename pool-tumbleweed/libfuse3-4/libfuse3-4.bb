SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
A FUSE file system is typically implemented as a standalone \
application that links with libfuse. libfuse provides a C API over \
the raw kernel interface."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.18.3"

RPM_NAME = "libfuse3-4-3.18.3-1.1.aarch64.rpm"
RPM_HASH = "b7bc2aefdc900f892114872e4b4e01d9f47a277b925d4ccd5b48d551e6ab4d7db329ef407a28fc9c881375d4df5d592218975ac32ca49252054e3f5d99478718"

RPROVIDES:${PN} += "libfuse3-4 \
libfuse3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/fusermount3 \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
