SUMMARY = "A tool for static C/C++ code analysis"
DESCRIPTION = " \
This is the gui for Cppcheck, a program to detect bugs that your C/C++ compiler \
doesn't see."
LICENSE = "GPL-3.0-or-later"

PV = "2.21.0"

RPM_NAME = "cppcheck-gui-2.21.0-1.2.aarch64.rpm"
RPM_HASH = "c3666690803da50b7735d542222b38d47ff3d97df9926fbd40145cc1c9f1be4a52ebf13c7e410dd39e8972efeb7384a62d113e791c767d8faa695d08a51113de"

RPROVIDES:${PN} += "cppcheck-gui"

RDEPENDS:${PN} += "cppcheck \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
