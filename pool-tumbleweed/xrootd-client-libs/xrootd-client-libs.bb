SUMMARY = "Libraries used by XRootD clients"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-client-libs-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "f0a0848ee78903cd8c1ddc4e8abe9fafcdd107f12d12f5bdc779f50a6c459ba698c87095fe0427b707499a48fbbd0e94409678808541a6269cf2f04fc3805ad7"

RPROVIDES:${PN} += "config-xrootd-client-libs \
libXrdCl.so.3 \
libXrdEc.so.1 \
libXrdFfs.so.3 \
libXrdPosix.so.3 \
libXrdPosixPreload.so.2 \
xrootd-client-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXrdUtils.so.3 \
libXrdXml.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libisal.so.2 \
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1 \
xrootd-libs"

inherit rpm
