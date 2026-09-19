SUMMARY = "Reference implementation of the 'Filesystem in Userspace'"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
This package contains helper programs for using FUSE mounts. \
 \
FUSE file systems are typically implemented as a standalone \
applications in their own right and are packaged separately."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.18.3"

RPM_NAME = "fuse3-3.18.3-1.1.aarch64.rpm"
RPM_HASH = "8cbad2a8ece25e5aded3fc1822c2d04f947442eb8fbc78dbabeef3364ad2152cd1e167cc7ec4a40ad44e0bf460880bfb8652adc50a4333d8e5be7301bbe4b54e"

RPROVIDES:${PN} += "config-fuse3 \
fuse3"

RDEPENDS:${PN} += "/usr/bin/sh \
group-trusted \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
permissions \
util-linux"

inherit rpm
