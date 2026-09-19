SUMMARY = "Assistive Technology Service Provider Interface - D-Bus based implementation"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the AT-SPI registry daemon. It provides a \
mechanism for all assistive technologies to discover and interact \
with applications running on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "2.60.6"

RPM_NAME = "at-spi2-core-2.60.6-1.1.aarch64.rpm"
RPM_HASH = "2cc2277d32e28a9cb30202c97682f3277cf3c314d148e7a72113220fb490698745b3402e27bbfaff70b37a62c4ea0711a83a9f2a103c8c38b58d1e0d65abd343"

RPROVIDES:${PN} += "at-spi2-atk-common \
at-spi2-atk-gtk2 \
at-spi2-core \
libatk-bridge.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libatk-bridge-2.0.so.0 \
libatspi.so.0 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0 \
python-abi \
typelib-Atspi"

inherit rpm
