SUMMARY = "Qt-based hex editor"
DESCRIPTION = "QHexEdit is a hex editor widget written in C++ for the Qt framework. \
It is a simple editor for binary data, just like QPlainTextEdit is for text \
data."
LICENSE = "LGPL-2.0-only"

PV = "0.9.0"

RPM_NAME = "qhexedit2-0.9.0-1.6.aarch64.rpm"
RPM_HASH = "9efe04d5a00930e8d4c54e80bb4d6fb2a2d16631e881ca40b5d8d7c78f379d6fbfdc3f5e149087639a931740e0109430e54c2621f04c50ce57fab64b9701a079"

RPROVIDES:${PN} += "qhexedit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
