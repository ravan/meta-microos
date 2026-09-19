SUMMARY = "RDP Server for Plasma"
DESCRIPTION = "RDP Server with settings Module for Plasma."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "krdp6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "b68f7d7be46371926b1c339cfcd351ef2f60bcd47a414db5872a5bce1b1fbf8012fea256ca06a6848f7c61731966a11d9cc0b0958741963d1da6c092078d3b9c"

RPROVIDES:${PN} += "krdp6 \
libKRdp.so.6"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6StatusNotifierItem.so.6 \
libKPipeWire.so.6 \
libKPipeWireDmaBuf.so.6 \
libKPipeWireRecord.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfreerdp-server3.so.3 \
libfreerdp3.so.3 \
libpam.so.0 \
libqt6keychain.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwinpr3.so.3 \
libxkbcommon.so.0"

inherit rpm
