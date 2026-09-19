SUMMARY = "Shared library for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains shared library for dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "libdico2-2.12-2.5.aarch64.rpm"
RPM_HASH = "e376ce178f6cfd71eac41ab80ab45b5dca8b03196d718eb7be3578332c8bad8e08fa0391948f470ab2a4b0b487c23bb8fb697f37241f4db8d4715aee862942b2"

RPROVIDES:${PN} += "libdico.so.2 \
libdico2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
