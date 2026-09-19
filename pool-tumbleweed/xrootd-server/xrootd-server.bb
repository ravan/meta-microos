SUMMARY = "XRootD (eXtended Root Daemon) server"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
The XRootD (eXtended Root Daemon) server binaries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-server-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "cfbdefb3dfa7d7dfeedb476b0e71ba8c07ae431877c6eeab4ffd5f84ee84794daab2dedf092fe18fb7bb90b3fdd18d9b18926b293e6d1774c295da80621d0f3f"

RPROVIDES:${PN} += "config-xrootd-server \
group-xrootd \
perl-XrdCmsNotify \
user-xrootd \
xrootd-server"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libXrdAppUtils.so.2 \
libXrdCl.so.3 \
libXrdCrypto.so.2 \
libXrdServer.so.3 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6 \
sysuser-shadow \
xrootd-client-libs \
xrootd-libs \
xrootd-server-libs"

inherit rpm
