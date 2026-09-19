SUMMARY = "Rime for Linux/IBus"
DESCRIPTION = "Rime Input Method Engine for Linux/IBus"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "ibus-rime-1.6.0-1.5.aarch64.rpm"
RPM_HASH = "a4344d2bdff836803dcbb062543a0e1d16f3bdbab465364a70d104558ee4d80f30411a628ced1e474336d0a3cb097b5c5d560c3ccd08c8cf9ac0036d5b3fe0e7"

RPROVIDES:${PN} += "ibus-rime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libnotify.so.4 \
librime.so.1"

inherit rpm
