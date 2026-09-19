SUMMARY = "Terminal control library without weak threading support"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the C++ library built with the version 6 ABI \
but build without weak threading support. \
 \
Use with environment variable LD_LIBRARY_PATH=/usr/lib64/ncurses6nt \
or the wrapper script ncursesnt ."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "libncurses_c++6-compat-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "b08e455007ec30e4f77de920c0c943eae507b2ea78e3cb9d56e9decb46a1c6f3b7c61eb4fafd72cf106cea292cd0c0518b06f4047f2c455c0219b456d3a188d1"

RPROVIDES:${PN} += "libncurses++.so.6 \
libncurses++w.so.6 \
libncurses-c++6-compat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.6 \
libformw.so.6 \
libgcc-s.so.1 \
libmenu.so.6 \
libmenuw.so.6 \
libncurses.so.6 \
libncurses6 \
libncursesw.so.6 \
libpanel.so.6 \
libpanelw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
terminfo-base"

inherit rpm
