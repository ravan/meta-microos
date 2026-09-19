SUMMARY = "direct Network File System support for QEMU"
DESCRIPTION = "This package contains a module for directly accessing nfs based image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-block-nfs-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "896a9afa4679e5855accce7f0ac1a46df2439ea927c8cc2769647795c8e76234dd43cc5bddd05e50f9c7ec428e560114305f40eada7cd8374a038d7bf77d528d"

RPROVIDES:${PN} += "qemu-block-nfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfs.so.16"

inherit rpm
