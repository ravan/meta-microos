SUMMARY = "Qt{5}-based GUI to GDB"
DESCRIPTION = "Gede is a graphical frontend (GUI) to GDB written in C++ and using the Qt5 toolkit. \
Gede supports debugging programs written in Ada, FreeBasic, C++, C, Rust, Fortran and Go."
LICENSE = "BSD-2-Clause"

PV = "2.22.1"

RPM_NAME = "gede-2.22.1-1.7.aarch64.rpm"
RPM_HASH = "dd90a81c37fc2a261b48d3be7c2b3bc33a75a0a1b0463c6e4a645d5f8d8adb33807b8ef0acbc873205012d9d2fe2a1ed33299206fb1877696211979847416c72"

RPROVIDES:${PN} += "gede"

RDEPENDS:${PN} += "/usr/bin/ctags \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
