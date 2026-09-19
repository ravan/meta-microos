SUMMARY = "Qt frontend for eiskaltdcpp"
DESCRIPTION = "This package contains the EiskaltDC++ program with GUI based on Qt. \
EiskaltDC++ is a program that uses the Direct Connect and Advanced \
Direct Connect protocols. It is compatible with DC++, AirDC++, \
FlylinkDC++ and other DC clients. EiskaltDC++ also interoperates with \
all common DC hub software."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-qt-2.4.2-6.2.aarch64.rpm"
RPM_HASH = "723834edde38ad8390d5a93f18bf353347d6042a62fa1a3f4f249ca5d5e45f4bf54586bb1f1acae6c1079aabc09cca63c40c9ec1b1e111dd5fb9a98ab5d1c8e4"

RPROVIDES:${PN} += "eiskaltdcpp-qt"

RDEPENDS:${PN} += "aspell \
eiskaltdcpp-common \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libaspell.so.15 \
libc.so.6 \
libeiskaltdcpp.so.2.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
