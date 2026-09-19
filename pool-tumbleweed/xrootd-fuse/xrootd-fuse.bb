SUMMARY = "FUSE-based XRootD filesystem mount"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the FUSE (file system in user space) \
XRootD mount tool."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-fuse-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "db9082f8566e451eb430be9d0900dff046551b4199fe23070d6d217e3036eb98088e089ee75789390d7f5c9f1d8555f40228f6e12818dd0ecc061f1689499cb3"

RPROVIDES:${PN} += "xrootd-fuse"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libXrdFfs.so.3 \
libXrdPosix.so.3 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
xrootd-client \
xrootd-libs"

inherit rpm
