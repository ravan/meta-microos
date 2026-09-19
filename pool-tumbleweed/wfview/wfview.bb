SUMMARY = "ICOM SDR transceiver control software"
DESCRIPTION = "wfview controls modern Icom rigs using either a USB serial connection or OEM \
network (ethernet or wifi) connection. Live, real-time spectrum analyzer data \
are displayed, and rig controls are presented. Additional programs may tie into the \
CIV bus using the pseudo-terminal device (linux and macOS), virtual serial port \
loopback (windows), or hamlib-compatible rigctld server."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "wfview-2.11-3.1.aarch64.rpm"
RPM_HASH = "f233650a0afaf4829e00d5d782990cc907530d7597a1cddb1a388b37b25c296fbd2899ab2d8490b768feead999c518892c8ae4d4a72c0e85a00a9b61286e0147"

RPROVIDES:${PN} += "wfview"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6SerialPort.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-libusb.so.0 \
libm.so.6 \
libopus.so.0 \
libportaudio.so.2 \
libqcustomplot-qt6.so.2 \
librtaudio.so.7 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
