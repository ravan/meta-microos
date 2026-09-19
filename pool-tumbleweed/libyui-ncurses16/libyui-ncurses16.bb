SUMMARY = "Libyui - NCurses (text based) user interface"
DESCRIPTION = "This package contains the NCurses (text based) user interface \
component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-ncurses16-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "36c907415f72d5e228f16e40f502c47be30b3f08239a69f0a566744bc8adda452d58a005ddd0c9ae8f627aab8fc4f7c7eee434346f57c1695fe4af168ec14ec0"

RPROVIDES:${PN} += "libyui-ncurses \
libyui-ncurses.so.16 \
libyui-ncurses16 \
yast2-ncurses \
yui-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
glibc-locale-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libpanelw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libyui.so.16 \
libyui16"

inherit rpm
