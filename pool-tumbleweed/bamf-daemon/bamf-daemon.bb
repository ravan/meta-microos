SUMMARY = "Window matching daemon"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains the daemon used by the library and a gio \
module that facilitates the matching of applications started \
through GDesktopAppInfo"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-daemon-0.5.6-1.17.aarch64.rpm"
RPM_HASH = "132ebce120d1372e712f87a1e312006b30028ec00b3900a037e671a2b639dba5d779114895673eb3e166c71cfb29805e1e5bf4ed67855753bb0db2b2b8b071af"

RPROVIDES:${PN} += "bamf-daemon"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libbamf3-2 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libstartup-notification-1.so.0 \
libwnck-3.so.0"

inherit rpm
