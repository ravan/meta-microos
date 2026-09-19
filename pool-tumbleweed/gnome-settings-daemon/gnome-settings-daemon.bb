SUMMARY = "Settings daemon for the GNOME desktop"
DESCRIPTION = "gnome-settings-daemon provides a daemon run by all GNOME sessions to \
provide live access to configuration settings and the changes done to \
them as well as basic services like a clipboard manager, controlling \
the startup of the screensaver, etc. \
 \
This module was previously part of GNOME Control Center, but has been \
split for a more general use."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "50.1+6"

RPM_NAME = "gnome-settings-daemon-50.1+6-1.2.aarch64.rpm"
RPM_HASH = "4738aa7193dddb3f5e49f5e6f6c7941e4e24e791bb0fe8bf264866f0e0b73fac057eba11570d90363afa36edb18bea4388f9ae2609430f3cd9ccb2607cdf6c98"

RPROVIDES:${PN} += "gnome-settings-daemon \
libgsd.so"

RDEPENDS:${PN} += "/usr/bin/sh \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libasound.so.2 \
libc.so.6 \
libcanberra.so.0 \
libcolord.so.2 \
libcups.so.2 \
libfontconfig.so.1 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgeoclue-2.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libgweather-4.so.0 \
libm.so.6 \
libmm-glib.so.0 \
libnm.so.0 \
libnotify.so.4 \
libp11-kit.so.0 \
libpolkit-gobject-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libsystemd.so.0 \
libupower-glib.so.3"

inherit rpm
