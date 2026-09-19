SUMMARY = "Note editor for GNOME"
DESCRIPTION = "Bijiben is a note editor designed to remain simple to use."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "40.2+git586.102d7c2f"

RPM_NAME = "bijiben-40.2+git586.102d7c2f-1.3.aarch64.rpm"
RPM_HASH = "a5a0f550a374722f2e060a860457b12a06b35ad47f52a93cc0bc13f7bc2cd7dc6592cb63987733a3762963122bd8e994e7aa10449ae096e8e5d6338593c9ff57"

RPROVIDES:${PN} += "bijiben \
gnome-notes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libical-glib.so.3 \
libjavascriptcoregtk-6.0.so.1 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libwebkitgtk-6.0.so.4 \
libxml2.so.16"

inherit rpm
