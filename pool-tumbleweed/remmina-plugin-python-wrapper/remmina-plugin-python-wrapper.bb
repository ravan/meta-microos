SUMMARY = "Adapter for remmina Python plugins"
DESCRIPTION = "This package provides an adapter used by remmina Python plugins"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-python-wrapper-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "dee64430091e960d7adaa7886c9b8f5a60e04d820111f92e15f3bb317f4f8710c0d57b61d28063dd5f87433fb5edb03eb3b1a6eb7bf585debbe03f3cbd9ca919"

RPROVIDES:${PN} += "remmina-plugin-python-wrapper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
libpython3.13.so.1.0 \
remmina"

inherit rpm
