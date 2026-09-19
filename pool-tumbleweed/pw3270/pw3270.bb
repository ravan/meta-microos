SUMMARY = "IBM 3270 Terminal emulator for GTK"
DESCRIPTION = "GTK-based IBM 3270 terminal emulator with many advanced features. It can be used to communicate with any IBM host that supports 3270-style connections over TELNET. \
 \
Based on the original x3270 code, pw3270 was originally created for Banco do Brasil, and is now used worldwide."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20241211"

RPM_NAME = "pw3270-5.5.0+git20241211-3.6.aarch64.rpm"
RPM_HASH = "21a1bb7908140f1eef95ce2975c0647d0707c9dc46a55e8a86ab43d2424fe7e35c7608ca38473ffbc7f57420ddbb22cb2ff4b02beae5e4d4d8903787371112f3"

RPROVIDES:${PN} += "pw3270"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
lib3270.so.5.5 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libv3270.so.5.5 \
pw3270-branding \
shared-mime-info"

inherit rpm
