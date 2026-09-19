SUMMARY = "GtkD vted library"
DESCRIPTION = "This package contains the GtkD vted library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libvted-3-0-3.9.0-3.10.aarch64.rpm"
RPM_HASH = "ff1cb65d8137c82ea838c32b7e067387ed6574488000f5ff56fb2521429cefec06113dc9ad9fc1365c1b5b9e9e61e4f4482858c78ee7770d4059f0be2f7e8b7b"

RPROVIDES:${PN} += "libvted-3-0 \
libvted-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1"

inherit rpm
