SUMMARY = "Amateur radio logbook software"
DESCRIPTION = "QLog is an Amateur Radio logging application. It is based on the Qt framework \
and uses SQLite as database backend. \
 \
QLogs aims to be as simple as possible, but to provide everything the operator \
expects from the log to be. This log is not currently focused on contests."
LICENSE = "GPL-3.0-or-later"

PV = "0.52.0"

RPM_NAME = "QLog-0.52.0-1.1.aarch64.rpm"
RPM_HASH = "f0d1e89b91adabbfb179b982ec28d1239c1744545771418d910a8c6bf247c417bd6d6e18bd037cc51196dfe74c6784d3002ded557e49243fe1b5c629e3c9778d"

RPROVIDES:${PN} += "QLog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6SerialPort.so.6 \
libQt6Sql.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libhamlib.so.4 \
libm.so.6 \
libqt6keychain.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
qt6-sql-sqlite"

inherit rpm
