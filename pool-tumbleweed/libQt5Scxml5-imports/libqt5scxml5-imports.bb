SUMMARY = "Qt 5 Scxml Addon - QML imports"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines \
from SCXML files. \
 \
The Qt SCXML module provides functionality to create state machines from SCXML files. \
It also contains functionality to support data models and executable content."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Scxml5-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "b93fc1b3df76e07246be75a8c12e6675071aba4443528db4a73b52f77d2ca9bc75deef6ac508a711eefa8d6f9f6805a50e8dcdaf2bb247dc14ed7779e528c5c3"

RPROVIDES:${PN} += "libQt5Scxml5-imports \
libdeclarative-scxml.so \
qt5qmlimport-QtScxml.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Scxml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
