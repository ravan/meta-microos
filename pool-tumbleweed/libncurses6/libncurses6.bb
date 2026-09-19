SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 6 ABI."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "libncurses6-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "bf9588c252e49f2ef6826518dff875fd155f152fe6e534f79da59bcfa0f328699fb15330a8b0da4095923da083d2c3ed46720f1393f26d04b9930185d3bf9c0a"

RPROVIDES:${PN} += "libform.so.6 \
libformw.so.6 \
libmenu.so.6 \
libmenuw.so.6 \
libncurses.so.6 \
libncurses6 \
libncursesw.so.6 \
libpanel.so.6 \
libpanelw.so.6 \
libtic.so.6 \
libticw.so.6 \
libtinfo.so.6 \
libtinfow.so.6 \
ncurses"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
terminfo-base"

inherit rpm
