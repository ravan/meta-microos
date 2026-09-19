SUMMARY = "Libyui - yast2 package selector widget for the NCurses UI"
DESCRIPTION = "This package contains the NCurses (text based) package selector \
component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-ncurses-pkg16-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "35829f4457079527ca7606dcd749ec4c1d3a65eb8f5a7ad4e814bb4a660f8eeeb09fee266f22c75d27b1ee8d6cb90d55d5d52c1dbd270d614827ff444f16b009"

RPROVIDES:${PN} += "libyui-ncurses-pkg \
libyui-ncurses-pkg.so.16 \
libyui-ncurses-pkg16 \
libyui-pkg \
yast2-ncurses-pkg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libyui-ncurses16 \
libyui.so.16 \
libyui16 \
libzypp \
libzypp.so.1735"

inherit rpm
