SUMMARY = "The session manager for the Cinnamon Desktop"
DESCRIPTION = "This packages contains the session manager for the Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.6.3"

RPM_NAME = "cinnamon-session-6.6.3-1.3.aarch64.rpm"
RPM_HASH = "1d1a9d967fda5079af8ff298ee9e0ef81168c02f90dc55c3f8190417c104cfeecd2140929aa49b6204e3222cd0f2627eb55bbb817576db47dfc65f76b1a83cd9"

RPROVIDES:${PN} += "cinnamon-session"

RDEPENDS:${PN} += "/usr/bin/dbus-launch \
/usr/bin/python3 \
/usr/bin/sh \
cinnamon \
cinnamon-settings-daemon \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXau.so.6 \
libXcomposite.so.1 \
libc.so.6 \
libcanberra.so.0 \
libcinnamon-desktop.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsystemd.so.0 \
upower"

inherit rpm
