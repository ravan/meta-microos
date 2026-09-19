SUMMARY = "MATE session settings daemon"
DESCRIPTION = "This package contains the daemon which is responsible for setting \
the various parameters of a MATE session and the applications that \
run under it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "mate-settings-daemon-1.28.0-1.9.aarch64.rpm"
RPM_HASH = "e9dbd42b3d0b535775b4643b3e463809c6f3d2e75dadb79bae4cdaadefb27bdde35233c254e35ce5ff53b3c64d8e441e3c4d924e82aa674f34d43820218af072"

RPROVIDES:${PN} += "liba11y-keyboard.so \
liba11y-settings.so \
libbackground.so \
libclipboard.so \
libhousekeeping.so \
libkeybindings.so \
libkeyboard.so \
libmedia-keys.so \
libmouse.so \
libmpris.so \
librfkill.so \
libsmartcard.so \
libsound.so \
libtyping-break.so \
libxrandr.so \
libxrdb.so \
libxsettings.so \
mate-settings-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libatspi.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libdconf.so.1 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmatekbd.so.6 \
libmatekbdui.so.6 \
libmatemixer.so.0 \
libnotify.so.4 \
libnspr4.so \
libnss3.so \
libplc4.so \
libpolkit-gobject-1.so.0 \
libpulse.so.0 \
libxklavier.so.16 \
mate-backgrounds \
matekbd-common"

inherit rpm
