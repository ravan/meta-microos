SUMMARY = "Browse the Fediverse"
DESCRIPTION = "Translations for package tuba."
LICENSE = "GPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "tuba-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "429890dba0badea41ef7ebea44fb578b9c98257193423ebf9d4bb40adabb6ef56b18d71e1fdd4bf43dcd7262e6d6d25331798a94ea15b84f132af7ac21e97bb8"

RPROVIDES:${PN} += "tuba"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libclapper-0.0.so.0 \
libclapper-gtk-0.0.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libicuuc.so.78 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libspelling-1.so.2 \
libwebkitgtk-6.0.so.4 \
libxml2.so.16"

inherit rpm
