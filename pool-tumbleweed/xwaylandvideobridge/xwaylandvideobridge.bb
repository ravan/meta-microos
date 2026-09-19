SUMMARY = "XWayland Video Bridge"
DESCRIPTION = "By design, X11 applications can't access window or screen contents for wayland clients. \
This is fine in principle, but it breaks screen sharing in tools like Discord, MS Teams, Skype, etc and more. \
This tool allows us to share specific windows to X11 clients, but within the control of the user at all times."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "xwaylandvideobridge-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "84ab54be0ed0939337832616eab6345146ed183fd38b317675716cff4e19261f32a5a4abae7cd95e5b8a6b7cfa96c51aede45305ab8b7573701829706ac4663f"

RPROVIDES:${PN} += "xwaylandvideobridge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WindowSystem.so.6 \
libKPipeWire.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
libxcb-record.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
