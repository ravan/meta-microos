SUMMARY = "USB gadget device configuration library"
DESCRIPTION = "libusbgx is a C library encapsulating the kernel USB gadget-configfs \
userspace API functionality."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libusbgx3-0.3.0-1.5.aarch64.rpm"
RPM_HASH = "51ad97e3e5a7866823806d43e655e6567b688546a302426f7bc89b42c0b1b5280498f670d610938080a1609f30d3c56173df5924e22e286a5ec177376433dee5"

RPROVIDES:${PN} += "libusbgx.so.3 \
libusbgx3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.15"

inherit rpm
