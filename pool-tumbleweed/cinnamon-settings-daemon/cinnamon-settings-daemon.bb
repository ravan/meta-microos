SUMMARY = "The settings Daemon for the Cinnamon Desktop"
DESCRIPTION = "This package contains the settings Daemon for the Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "6.4.3"

RPM_NAME = "cinnamon-settings-daemon-6.4.3-2.4.aarch64.rpm"
RPM_HASH = "685e097449c805c358b170bae65f7ea384f7eb11ee1b2e2908b858fbbccf5bf58dda7ec6a6365eea04573d219bd7a60f37e5c70e7be65efe5b9e3cb3ca5e5e59"

RPROVIDES:${PN} += "cinnamon-settings-daemon \
config-cinnamon-settings-daemon \
libcsd.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libcinnamon-desktop.so.4 \
libcolord.so.2 \
libcups.so.2 \
libcvc.so.0 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomekbd.so.8 \
libgnomekbdui.so.8 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
liblcms2.so.2 \
libm.so.6 \
libnotify.so.4 \
libnspr4.so \
libnss3.so \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libplc4.so \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
libupower-glib.so.3 \
libwacom.so.9 \
libxklavier.so.16"

inherit rpm
