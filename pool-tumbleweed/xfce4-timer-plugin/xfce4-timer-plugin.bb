SUMMARY = "Alarm Clock Plugin for the Xfce Panel"
DESCRIPTION = "The Timer plugin provides the functionality of an alarm clock and will run an \
alarm at a specified time or at the end of a specified countdown period."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "xfce4-timer-plugin-1.8.0-1.4.aarch64.rpm"
RPM_HASH = "18dce16a470f241d2b5c09f36d5df44aa8b35ac5c3a36d0865ff684384ff902e56fc7e43d40671808b25a2b6b39d9baf8d37aaf1f27e8a9c67626ebdae5e5e95"

RPROVIDES:${PN} += "libxfcetimer.so \
xfce4-panel-plugin-timer \
xfce4-timer-plugin"

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
