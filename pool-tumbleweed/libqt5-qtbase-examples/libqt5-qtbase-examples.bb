SUMMARY = "Qt5 base examples"
DESCRIPTION = "Examples for the libqt5-qtbase modules."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libqt5-qtbase-examples-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "7c8d227204f7a9c73ee4695cf3afa3d08b5272c67eb20e4b10f7b414c030a0461d93172b581eba47e11ac77b899406c2b14dd732ca06dbcbaf03d425cdfadc23"

RPROVIDES:${PN} += "libechoplugin.so \
libpnp-extrafilters.so \
libqt5-qtbase-examples \
libsimplestyleplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
