SUMMARY = "Hardware Sensor Plugin for the Xfce Panel"
DESCRIPTION = "The Sensors plugin and standalone application allow to monitor various hardware \
sensors supported by libsensors."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "xfce4-sensors-plugin-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "231eec542ad67082e222abd391c5e10bdf30a00f5b847a2ff5fb004908abc0cd8d42efbd96c7432f54e6112dc7d0e6894196c2db26e188f3fbffc00ec952e829"

RPROVIDES:${PN} += "libxfce4-sensors-plugin.so \
xfce4-panel-plugin-sensors \
xfce4-sensors-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXNVCtrl.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsensors.so.4 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
