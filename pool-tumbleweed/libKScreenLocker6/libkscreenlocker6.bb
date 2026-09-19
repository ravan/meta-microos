SUMMARY = "Library and components for secure lock screen architecture"
DESCRIPTION = "Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libKScreenLocker6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "22bcc67a000ac97b68d31ede9796fa17fc725231357cc556168e17ec3c67afbe274b690e290e642bb5e1e326462eb9ead3ba9af2f09105f9f2be50cf932c85f4"

RPROVIDES:${PN} += "libKScreenLocker.so.6 \
libKScreenLocker6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0 \
libxcb-keysyms.so.1 \
libxcb.so.1"

inherit rpm
