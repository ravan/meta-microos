SUMMARY = "Thunar Extension Library"
DESCRIPTION = "This package contains the Thunar extension library."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.10"

RPM_NAME = "libthunarx-3-0-4.20.10-1.1.aarch64.rpm"
RPM_HASH = "0ebb2d45c218c6e089819677235ef6e7c1221a0becbb38576ce25b27602e5acca79b620a16e3976a195309dc0b083387ab5917381e473c6e12a521194454cc6c"

RPROVIDES:${PN} += "libthunarx-3-0 \
libthunarx-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
