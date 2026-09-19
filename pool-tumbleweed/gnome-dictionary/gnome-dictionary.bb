SUMMARY = "Utility to look up words in dictionary sources"
DESCRIPTION = "The Dictionary application enables you to search words and terms on a \
dictionary source."
LICENSE = "GPL-2.0-or-later"

PV = "40.0"

RPM_NAME = "gnome-dictionary-40.0-4.13.aarch64.rpm"
RPM_HASH = "6749d2afe237f8c4a0ef50189eea1db2f9af60f8b906e98e9f6cd14275b28f044a7b2f38a283742298dca0f4b01a4020dd021cb1c96d95ee67f44bd462138025"

RPROVIDES:${PN} += "gnome-dictionary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
