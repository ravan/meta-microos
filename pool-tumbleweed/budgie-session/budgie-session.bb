SUMMARY = "Fork of gnome-session"
DESCRIPTION = "Budgie Session is a softish fork of gnome-session, \
designed to provide a stable session manager for Budgie 10.x"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0+0"

RPM_NAME = "budgie-session-1.0.0+0-1.2.aarch64.rpm"
RPM_HASH = "7f0356c6924c69de7807543c21de8e17c5111861a8b08d6b47d595234e0bb74eff798ea8ec000524e9e270afca1fdf3dd2ff769c221ae617c0bc0b1ecea3fdd2"

RPROVIDES:${PN} += "budgie-session"

RDEPENDS:${PN} += "/usr/bin/dbus-launch \
/usr/bin/sh \
gsettings-desktop-schemas \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libsystemd.so.0 \
libwayland-client.so.0"

inherit rpm
