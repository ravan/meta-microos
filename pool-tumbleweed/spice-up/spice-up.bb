SUMMARY = "Desktop presentation application"
DESCRIPTION = "Spice-up is a desktop presentation application \
based upon SpiceOfDesign's presentation concept."
LICENSE = "GPL-3.0-only"

PV = "1.9.1"

RPM_NAME = "spice-up-1.9.1-2.9.aarch64.rpm"
RPM_HASH = "74fcd57c2b56fee3de042892dcceb1dfa5c83ae2da9e0b3784c48254f8bb56255321e9bc652971c04443d7cc3d9def037cefe1de2a49efadba5bd41b2cd7350a"

RPROVIDES:${PN} += "spice-up"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0"

inherit rpm
