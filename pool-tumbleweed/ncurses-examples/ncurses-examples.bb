SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "ncurses-examples-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "9c34e5bf6cd29ee8f3f98fe46b6754bbd285d65d42e98ee9d4e22712a2b0f37d2b5aae5e3f20db7f1524ebdc87019ceb4ccb107fb4436a510924e338ce94aed0"

RPROVIDES:${PN} += "ncurses-examples \
ncurses-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libformw.so.6 \
libm.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
ncurses-utils"

inherit rpm
