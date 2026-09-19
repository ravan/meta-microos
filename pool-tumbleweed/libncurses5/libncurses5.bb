SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 5 ABI."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "libncurses5-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "727d1c2ee2d641ca83fb95ff06f4d92694ddc4b82c8438df9706e8d9a20ba714c07bf69f725bdbdf81a8693038a7bef49f4e9013600d49cdf647e8e3840db240"

RPROVIDES:${PN} += "libform.so.5 \
libformw.so.5 \
libmenu.so.5 \
libmenuw.so.5 \
libncurses.so.5 \
libncurses5 \
libncursesw.so.5 \
libpanel.so.5 \
libpanelw.so.5 \
libtic.so.5 \
libticw.so.5 \
libtinfo.so.5 \
libtinfow.so.5 \
ncurses"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
terminfo-base"

inherit rpm
