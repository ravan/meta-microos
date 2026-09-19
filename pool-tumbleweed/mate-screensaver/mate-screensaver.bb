SUMMARY = "MATE Desktop screensaver"
DESCRIPTION = "mate-screensaver is a screen saver and locker that integrates with \
the MATE desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-screensaver-1.28.0-1.11.aarch64.rpm"
RPM_HASH = "82afd7ac5767354d2a999e5449b52f2b79ff1b2c1b898ff7864d0d5d83ac67269d18fc001e190e25d7856e4531c7c7120b6a1f8c0fd4cbf831b083a5a6bd9498"

RPROVIDES:${PN} += "config-mate-screensaver \
mate-screensaver"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-menu.so.2 \
libmatekbdui.so.6 \
libnotify.so.4 \
libpam.so.0 \
libpango-1.0.so.0 \
libsystemd.so.0 \
libxklavier.so.16 \
mate-session-manager-gschemas"

inherit rpm
