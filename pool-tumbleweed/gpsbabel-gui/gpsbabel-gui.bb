SUMMARY = "Qt GUI interface for GPSBabel"
DESCRIPTION = "Qt GUI interface for GPSBabel"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "gpsbabel-gui-1.10.0-3.2.aarch64.rpm"
RPM_HASH = "ba6bd58d2e25208dee7fecbd23d95d01264b7c63944ccff917de5c5d480fad9630191989457221886734f3e792cee8c7eff7c2beb1b754ddd75682cb216f9807"

RPROVIDES:${PN} += "gpsbabel-gui"

RDEPENDS:${PN} += "gpsbabel \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6SerialPort.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
