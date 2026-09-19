SUMMARY = "Screen sharing using the VNC/RFB protocol"
DESCRIPTION = "VNC-compatible server to share KDE desktops."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "krfb-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0ad1db645367bc9fac11340a6e347dea8647e0e16b66513d7e5c84094092a2ab1a8dfdea5a40a6ee1ab8e7d5cf6d64674b6ea3a6cac357affee497d175c98c82"

RPROVIDES:${PN} += "krfb \
libkrfbprivate.so.5.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKPipeWire.so.6 \
libKPipeWireDmaBuf.so.6 \
libKWaylandClient.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libstdc++.so.6 \
libvncserver.so.1 \
libwayland-client.so.0 \
libxcb-damage.so.0 \
libxcb-image.so.0 \
libxcb-shm.so.0 \
libxcb.so.1"

inherit rpm
