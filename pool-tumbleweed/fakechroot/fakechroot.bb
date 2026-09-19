SUMMARY = "Preloadable library for a fake chroot environment"
DESCRIPTION = "fakechroot runs a command in an environment where it is possible to use the \
chroot(8) command without root privileges. This is useful for allowing users to \
create own chrooted environments with the possibility to install other packages \
without the need for root privileges. \
 \
fakechroot does this by replacing some libc library functions (chroot(2), \
open(2), etc.) by ones that simulate the effect of being called with root \
privileges. \
 \
These wrapper functions are in a shared library called libfakechroot.so, which \
can be loaded through the LD_PRELOAD mechanism of the dynamic loader."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.20.1"

RPM_NAME = "fakechroot-2.20.1-3.9.aarch64.rpm"
RPM_HASH = "5ab1f9f128d5e30e0e46a2fbb6a26feeeb5e0ac93720b2fcddcd8cba58c5aa60976fc6dc729f5c8edc4ac0783996c6bfc31be571c03a1a48fe9b893663c4b1b7"

RPROVIDES:${PN} += "config-fakechroot \
fakechroot \
libfakechroot.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
