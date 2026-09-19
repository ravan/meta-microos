SUMMARY = "Chinese Lunar calendar library"
DESCRIPTION = "Library to support date conversion from/to chinese lunar calendar"
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-date-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "925d1a302df47fcc1b3c6a79f4a0d146793a0c0e86ec21893a27b98ad3d481be841fc5cc7f0815c3422d29f6c3fb11ba889120ce6aef1c1461dc0a1fa146acb9"

RPROVIDES:${PN} += "lunar-date"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblunar-date-3.0.so.1"

inherit rpm
