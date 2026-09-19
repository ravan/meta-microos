SUMMARY = "Clipboard Manager"
DESCRIPTION = "Clipboard history manager for the Pantheon Desktop."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "clipped-1.1.1-2.9.aarch64.rpm"
RPM_HASH = "7dfa50ddb5890dacea1d5950b2fa6bd74ebfcde5e172a4c25e4020fa5eb07e84a16e2d368232afb730b63e6b7bfb0cc334219d9fecd41ee4e5bf005693eeca77"

RPROVIDES:${PN} += "clipped"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsqlite3.so.0"

inherit rpm
