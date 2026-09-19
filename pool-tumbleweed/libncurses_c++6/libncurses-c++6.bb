SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the C++ library built with the version 6 ABI."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "libncurses_c++6-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "4affb2e609e5b729fe80bc0dbe284ac70a592cc188ab4a7b17eb492c1e8ce0ab4a6507866b7cfae94b5b8aaa47fff61752adc5ddbe70251975897bc8e690bde2"

RPROVIDES:${PN} += "libncurses++.so.6 \
libncurses++w.so.6 \
libncurses-c++6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.6 \
libformw.so.6 \
libgcc-s.so.1 \
libmenu.so.6 \
libmenuw.so.6 \
libncurses.so.6 \
libncursesw.so.6 \
libpanel.so.6 \
libpanelw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
terminfo-base"

inherit rpm
