SUMMARY = "Key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.49.0"

RPM_NAME = "libdconf1-0.49.0-1.5.aarch64.rpm"
RPM_HASH = "711f30d36e15ecee81778b051ac5812150e8e51f6cbfe8291f554e071128b2444c70069b795136ad35690f1d3580a1de0bab422521bdc39a0b363d6efc99a07b"

RPROVIDES:${PN} += "libdconf.so.1 \
libdconf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
dconf \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
