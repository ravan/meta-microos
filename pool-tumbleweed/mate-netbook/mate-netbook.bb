SUMMARY = "MATE Desktop window management tool"
DESCRIPTION = "This package provides a simple window management tool which provides the \
following functionality: \
 * Allow to set basic rules for window types; \
 * Allow exceptions to the rules based on string matching for window \
   name and window class; \
 * Allows reversing of rules when the user manually changes something; \
 * Re-decorates windows on un-maximise"
LICENSE = "GPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "mate-netbook-1.26.0-1.20.aarch64.rpm"
RPM_HASH = "b7ea5cbbdb9b5dd87d4d34e01d847a6ae7889ff454a37c0db581f70b5ee4594dd15918c2289898d2e8ac76171ece63a4a63f5b10411f8254ef4195e4d58b4903"

RPROVIDES:${PN} += "config-mate-netbook \
mate-netbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfakekey.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-panel-applet-4.so.1 \
libpango-1.0.so.0 \
libwnck-3.so.0 \
mate-panel"

inherit rpm
