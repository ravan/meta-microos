SUMMARY = "Terminal control library without weak threading support"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 6 ABI \
but build without weak threading support. \
 \
Use with environment variable LD_LIBRARY_PATH=/usr/lib64/ncurses6nt \
or the wrapper script ncursesnt ."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "libncurses6-compat-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "6c94037b2e5ca7cc5a3d83df0a98507a755700cae636b697c31df88d20377cbc5fe0b3414eda266413fb0916b001f4deb679d5eec9727140d5a61d29463a4c85"

RPROVIDES:${PN} += "libform.so.6 \
libformw.so.6 \
libmenu.so.6 \
libmenuw.so.6 \
libncurses.so.6 \
libncurses6-compat \
libncursesw.so.6 \
libpanel.so.6 \
libpanelw.so.6 \
libtic.so.6 \
libticw.so.6 \
libtinfo.so.6 \
libtinfow.so.6"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses6 \
terminfo-base"

inherit rpm
