SUMMARY = "Introspection bindings for the Telepathy Call channel handling library"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "typelib-1_0-TelepathyFarstream-0_6-0.6.2-4.8.aarch64.rpm"
RPM_HASH = "41bfe13fa7a67f803e06109c6a872f44292b9683d961d7357bf0547f52fb6ad135b7f4f08c89371e27562faf38684afe5d03a534bf5121bcbc188e92975697ef"

RPROVIDES:${PN} += "typelib-1-0-TelepathyFarstream-0-6 \
typelib-TelepathyFarstream"

RDEPENDS:${PN} += "libtelepathy-farstream.so.3 \
typelib-Farstream \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-TelepathyGLib"

inherit rpm
