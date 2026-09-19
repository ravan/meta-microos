SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the C++ library built with the version 5 ABI."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "libncurses_c++5-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "46869d6ee72d16e0226c655abbecb701a8f4e7a71ceb355754eecf32b7d415b63568d8328add18766c9e245e28e1d887804e3d85fdeaa5ed4f37ddb0851ee11f"

RPROVIDES:${PN} += "libncurses++.so.5 \
libncurses++w.so.5 \
libncurses-c++5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.5 \
libformw.so.5 \
libgcc-s.so.1 \
libmenu.so.5 \
libmenuw.so.5 \
libncurses.so.5 \
libncursesw.so.5 \
libpanel.so.5 \
libpanelw.so.5 \
libstdc++.so.6 \
libtinfo.so.5 \
terminfo-base"

inherit rpm
