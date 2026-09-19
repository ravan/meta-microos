SUMMARY = "Commandline Tools for Tiled MapEditor"
DESCRIPTION = "This package contains tmxviewer, a simple application to view Tiled maps \
and tmxrasterizer which is also a command line tool."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "tmxtools-1.12.2-1.2.aarch64.rpm"
RPM_HASH = "3165957a110be719020766f152cc096f2105629be34c8b2d7fd25282ca733a371dbde0fd34d518827a6e7c13a2706ac435ac2f872768cffe2341c65c54f15171"

RPROVIDES:${PN} += "tmxtools"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtiled.so"

inherit rpm
