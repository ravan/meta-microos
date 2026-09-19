SUMMARY = "Power Management for the Xfce Desktop Environment"
DESCRIPTION = "The Xfce Power Manager is a tool for the Xfce desktop environment for managing \
profiles of policies which affect power consumption, such as the display \
brightness level, display sleep times, or CPU frequency scaling. It can also \
trigger actions on certain events such as closing the lid or reaching low \
battery levels and provides a set of interfaces to inform other applications \
about current power level so that they can adjust their power consumption. \
Furthermore, it provides a standardized inhibit interface which allows \
applications to prevent automatic sleep actions via the power manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "xfce4-power-manager-4.20.1-1.1.aarch64.rpm"
RPM_HASH = "46454272b6b2382f5c46b3551ae9297f13d3ad1086043e6ef68b38c31556e32ed6b2b9fee5d251ab295bb5fbd4c5a18579b7329072bf8beb51f9731b3ed1200f"

RPROVIDES:${PN} += "config-xfce4-power-manager \
xfce4-power-manager \
xfce4-power-manager-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libupower-glib.so.3 \
libwayland-client.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
pkexec \
systemd \
upower"

inherit rpm
