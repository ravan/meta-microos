SUMMARY = "Maliit Framework tests"
DESCRIPTION = "Provides unit tests of the Maliit Framework."
LICENSE = "LGPL-2.1-only"

PV = "2.3.0"

RPM_NAME = "maliit-framework-tests-2.3.0-1.18.aarch64.rpm"
RPM_HASH = "960745dd079d199012cbfd3ea1eca8377a702faa5dec0d761c656250a6fd704a9125fb2f86c00ebd9bf4a93a2a1e069db47fa53b3c1f11cadce916b3cfe7f04c"

RPROVIDES:${PN} += "libdummyimplugin.so \
libdummyimplugin2.so \
libdummyimplugin3.so \
libdummyplugin.so \
maliit-framework-tests"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Test.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmaliit-glib.so.2 \
libmaliit-plugins.so.2 \
libstdc++.so.6 \
libwayland-client.so.0 \
qt5qmlimport-QtQuick.2"

inherit rpm
