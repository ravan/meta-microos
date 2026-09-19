SUMMARY = "Development files for python313-pyside6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "(GPL-2.0-only & (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0) | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "python313-pyside6-devel-6.11.2-1.2.aarch64.rpm"
RPM_HASH = "9c8668f5bdb7bbb6e9e43976a46a74f72fac206e18a5b3a617ce251a9782b2b33ff097488e5110c79135a99a5f1fe9894b2ac655a1b103c5de38bd24743a602e"

RPROVIDES:${PN} += "cmake-PySide6 \
pkgconfig-pyside6 \
python3-pyside6-devel \
python313-pyside6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-shiboken6 \
python313-pyside6"

inherit rpm
