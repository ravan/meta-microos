SUMMARY = "Internal support library for GNOME games"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.2"

RPM_NAME = "libgnome-games-support-1-3-1.8.2-1.19.aarch64.rpm"
RPM_HASH = "a48cadded1547fae6bf2e646cc8b00832482c12812141fad675241885e7199c5addf24ef10f5db4ebd4bba886fbef8046119a6cf5b08c92b52dc6c76bd8738c6"

RPROVIDES:${PN} += "libgnome-games-support-1-3 \
libgnome-games-support-1.so.3 \
libgnome-games-support1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
