SUMMARY = "PostScript document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read PostScript documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-plugin-psdocument-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "f297eee753b15046c851b0c61f650f62e58003c36c76c115d7ab7654426536da41867e8b14e96cca1a37847b3b8dfa75f836761c3b0f5de55b3237a340dccca8"

RPROVIDES:${PN} += "libpsdocument.so \
xreader-plugin-psdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libspectre.so.1 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
