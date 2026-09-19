SUMMARY = "PDF document support for Papers"
DESCRIPTION = "A plugin for Papers to read PDF documents."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "papers-plugin-pdfdocument-50.3-1.1.aarch64.rpm"
RPM_HASH = "ff3de52b510f1d4525179669dc95bcce790cd6c54f0477cef2590f2086dffdc08c1404c393f0100f2da8f2411293b273c48af607a649148d90dd931cfce9f312"

RPROVIDES:${PN} += "libpdfdocument.so \
papers-plugin-pdfdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpoppler-glib.so.8 \
libppsdocument-4.0.so.6 \
papers"

inherit rpm
