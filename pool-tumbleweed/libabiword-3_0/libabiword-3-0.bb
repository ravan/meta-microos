SUMMARY = "A Multiplatform Word Processor - Library files"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "libabiword-3_0-3.0.8-1.5.aarch64.rpm"
RPM_HASH = "46f1f2ea4efdd7f9a658e95a70168d992b71271f39064c8d9a85d124fd7c5698e0562c2b9a11843b5eefb6fd57aa2f8dbde7b7b93909976d2264140ea0c6b800"

RPROVIDES:${PN} += "libabiword-3-0 \
libabiword-3.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libenchant.so.1 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgoffice-0.10.so.10 \
libgsf-1.so.114 \
libgtk-3.so.0 \
libjpeg.so.8 \
liblink-grammar.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libreadline.so.8 \
librevenge-0.0.so.0 \
librsvg-2.so.2 \
libstdc++.so.6 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libwpd-0.10.so.10 \
libwpg-0.3.so.3 \
libwps-0.4.so.4 \
libwv-1.2.so.4 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1"

inherit rpm
