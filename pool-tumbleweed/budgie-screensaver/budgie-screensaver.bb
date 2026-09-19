SUMMARY = "Fork of GNOME Screensaver for Budgie 10"
DESCRIPTION = "Fork of GNOME Screensaver for Budgie 10"
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0+0"

RPM_NAME = "budgie-screensaver-5.1.0+0-1.5.aarch64.rpm"
RPM_HASH = "df75c35e9995f4e400d1c90270c2a38ed434ad810b240952c0b373a4537f7ed31c8cb1b9277a3800a88aa633fe61f2bb7cc1d6861a5908b7277a7e20e732e567"

RPROVIDES:${PN} += "budgie-screensaver"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpam.so.0 \
libsystemd.so.0 \
pam \
procps"

inherit rpm
