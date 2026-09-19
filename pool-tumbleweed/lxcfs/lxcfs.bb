SUMMARY = "FUSE filesystem for LXC"
DESCRIPTION = "LXCFS is a small FUSE filesystem written with the intention of making Linux \
containers feel more like a virtual machine. It started as a side-project of \
LXC but is usable by any runtime."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "lxcfs-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "68023840b9d6271c54236c716f3d4efd07674f45d9c2f7c718f7e4af3a2e7deb116fdff467c774781c92409c60f30c54d9c382d45c191a8e43def14d5c59d3f2"

RPROVIDES:${PN} += "liblxcfs.so \
lxcfs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libgcc-s.so.1 \
systemd"

inherit rpm
