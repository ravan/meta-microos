SUMMARY = "PDF document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read PDF documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-plugin-pdfdocument-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "0b70dcf72eb214dfd06387e49f153a1212cc684d37bc83ed2d010cc516e87cdf8035b39628c79c37e8b7706c019473cf60467611c9c9d12c73c4b07ca73493b6"

RPROVIDES:${PN} += "libpdfdocument.so \
xreader-plugin-pdfdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpoppler-glib.so.8 \
libxml2.so.16 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
