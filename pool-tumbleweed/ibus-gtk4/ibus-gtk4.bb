SUMMARY = "IBus input method support for gtk4 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk4."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "ibus-gtk4-1.5.34-2.1.aarch64.rpm"
RPM_HASH = "261724c398edf0bb193e8461bfb47b69d58ba9947d63bbdc9a5c422ec7a1d7a2c2af10c38f8fbb83c3fed6fe846de8f5dc740bdab8ea7c36c7da90f0f0183b5c"

RPROVIDES:${PN} += "ibus-gtk4 \
libim-ibus.so"

RDEPENDS:${PN} += "/usr/bin/sh \
glib2-tools \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libibus-1.0.so.5 \
libpango-1.0.so.0"

inherit rpm
