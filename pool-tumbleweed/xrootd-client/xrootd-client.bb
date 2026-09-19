SUMMARY = "XRootD command line client tools"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the command line tools used to \
communicate with XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-client-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "cc0c68783955194e1a392512e4e5366646ad07cfa531e9ce2e9eaa91c78452726e38ce84f0e0a2c27f4c56e05add849ee6fe92848d2f8d7c5a6b85bfbe10424e"

RPROVIDES:${PN} += "xrootd-cl \
xrootd-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXrdAppUtils.so.2 \
libXrdCl.so.3 \
libXrdCrypto.so.2 \
libXrdPosix.so.3 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1 \
xrootd-client-libs \
xrootd-libs"

inherit rpm
