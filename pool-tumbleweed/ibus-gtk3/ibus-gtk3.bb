SUMMARY = "IBus input method support for gtk3 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk3."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "ibus-gtk3-1.5.34-2.1.aarch64.rpm"
RPM_HASH = "71d427c40734a3594d55d2337aaf64739795ebddc5b3fc344c2d387e526bf035f2ab6321e2bcc66d4fc0fdc2aa4bcd02d9a79d8b79513f71e7686172e4fe137a"

RPROVIDES:${PN} += "ibus-gtk3"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libpango-1.0.so.0"

inherit rpm
