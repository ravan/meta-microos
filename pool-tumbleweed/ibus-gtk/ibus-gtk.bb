SUMMARY = "IBus input method support for gtk2 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk2."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "ibus-gtk-1.5.34-2.1.aarch64.rpm"
RPM_HASH = "ffe818c1e81856dc34d4b0a4a4158cf6f7e029418d304646b309cd471e22809952e6cc7fb99d085a13215a703846e9660c7a4c0a8157cd303828bf187a6e3bc6"

RPROVIDES:${PN} += "ibus-gtk"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-tools \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libibus-1.0.so.5 \
libpango-1.0.so.0"

inherit rpm
