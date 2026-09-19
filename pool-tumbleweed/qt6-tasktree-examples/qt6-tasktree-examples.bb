SUMMARY = "Examples for the qt6-tasktree modules"
DESCRIPTION = "Examples for the qt6-tasktree modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-tasktree-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d8bc32a9926901200e1786c1083185d0be2d0431ee6350b00a7fde1fc823acaf364b37a63af3c0349977e6ddf973fe28bdbe0a4268700014f8a475f72a075b9e"

RPROVIDES:${PN} += "qt6-tasktree-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6TaskTree.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
