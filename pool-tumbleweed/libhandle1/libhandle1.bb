SUMMARY = "XFS Filesystem-specific Shared library"
DESCRIPTION = "libhandle1 contains the shared libraries needed by xfsprogs \
to run xfsprogs programs. \
 \
libhandle1 is always needed by xfsprogs. If you want to use this \
library for your own new xfs tools install xfsprogs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "6.19.0"

RPM_NAME = "libhandle1-6.19.0-1.5.aarch64.rpm"
RPM_HASH = "9f80566b1265d259a44b062aebd485e1f9bc65bdeb1c1d56bdb08387fd1577c8d0946e6f2129d3b5ce8e84b8b202df1d14ed71047b8a4357d1b95cc1ea2e8981"

RPROVIDES:${PN} += "libhandle.so.1 \
libhandle1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
