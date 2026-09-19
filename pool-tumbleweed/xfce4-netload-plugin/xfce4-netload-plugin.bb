SUMMARY = "Network Load Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Netload plugin allows to monitor the netowrk load of a given network \
interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "xfce4-netload-plugin-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "7436f0532325322b6276da194c655232092c1598ab35a9a8e08b3dc6b4884b575d15dea374d270c5d5f14badfba9d6a57318ebf7f8ebac139e4627b38c41e123"

RPROVIDES:${PN} += "libnetload.so \
xfce4-netload-plugin \
xfce4-panel-plugin-netload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
