SUMMARY = "Qt{6}-based GUI to GDB"
DESCRIPTION = "Gede is a graphical frontend (GUI) to GDB written in C++ and using the Qt5 toolkit. \
Gede supports debugging programs written in Ada, FreeBasic, C++, C, Rust, Fortran and Go."
LICENSE = "BSD-2-Clause"

PV = "2.22.1"

RPM_NAME = "gede-qt6-2.22.1-1.7.aarch64.rpm"
RPM_HASH = "ece5501168215ae96d02a19f94c355a6ecd99b811bfd3b3140f8688e61ebdfbf2e4a7896977a8a69aa5bb9bd3a52dc822b4c389117771bbb7c41abaddb137d4c"

RPROVIDES:${PN} += "gede \
gede-qt6"

RDEPENDS:${PN} += "/usr/bin/ctags \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
