SUMMARY = "Userspace tools for Linux kernel containers"
DESCRIPTION = "LXC is the well-known and heavily tested low-level Linux container runtime."
LICENSE = "LGPL-2.1-or-later"

PV = "7.0.0"

RPM_NAME = "lxc-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "777e1d5f3b7741838035fa3c2db0dfdb6db547ba9996d3f3cdd41763b79f0e7e264ed37193de0970a165cd0f6c4c6e409260e278aa267a118c77af5e02fdf2fb"

RPROVIDES:${PN} += "config-lxc \
lxc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6 \
libcap-progs \
libcap.so.2 \
libdbus-1.so.3 \
libgcc-s.so.1 \
liblxc.so.1 \
libseccomp.so.2 \
libselinux.so.1 \
lxcfs \
lxcfs-hooks-lxc \
rsync"

inherit rpm
