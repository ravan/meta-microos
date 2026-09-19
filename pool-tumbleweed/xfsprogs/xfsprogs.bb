SUMMARY = "Utilities for managing the XFS file system"
DESCRIPTION = "A set of commands to use the XFS file system, including mkfs.xfs. \
 \
XFS is a high performance journaling file system which originated on \
the SGI IRIX platform.	It is completely multithreaded. It can support \
large files and large file systems, extended attributes, and variable \
block sizes. It is extent based and makes extensive use of Btrees \
(directories, extents, and free space) to aid both performance and \
scalability. \
 \
Refer to the documentation at https://xfs.wiki.kernel.org/ for complete \
details.  This implementation is on-disk compatible with the IRIX \
version of XFS."
LICENSE = "GPL-2.0-or-later"

PV = "6.19.0"

RPM_NAME = "xfsprogs-6.19.0-1.5.aarch64.rpm"
RPM_HASH = "e2282397c1756ce8473270d70f0f7afc0b867d23d3a4ca809836df19bf3f1c7b02dcf7286417ab8c1781a5a81622bd889cc9e0f5e0aa237cfb955292617fd4af"

RPROVIDES:${PN} += "xfsprogs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libedit.so.0 \
libinih.so.0 \
liburcu.so.8 \
libuuid.so.1"

inherit rpm
