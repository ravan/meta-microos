SUMMARY = "Library of FUSE, the User space File System for GNU/Linux and BSD"
DESCRIPTION = "With FUSE, a user space program can export a file system through the \
kernel-default (Linux kernel)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "libulockmgr1-2.9.9-8.6.aarch64.rpm"
RPM_HASH = "e26682d530b5a566367f9899963f722ccd50ffcc5016d58672b1b7c48fa2424ae95bcd1e465f740a59a517e595c2a2e746d3c8ec59a0fe7acd2e518a3358827d"

RPROVIDES:${PN} += "libulockmgr.so.1 \
libulockmgr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
