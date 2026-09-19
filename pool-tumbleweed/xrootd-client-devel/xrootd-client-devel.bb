SUMMARY = "Development files for XRootD clients"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD client development"
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-client-devel-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "dd37bef1423d2042c185dfa218145805d6627a03a37cee1f58f4136e70bf61339d16b59ac579ebae9ba7a3e8a0c02436791c0296b44d6bfd3d74f97887ce3a40"

RPROVIDES:${PN} += "xrootd-cl-devel \
xrootd-client-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXrdCrypto.so.2 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
xrootd-client-libs \
xrootd-libs-devel"

inherit rpm
