SUMMARY = "The Facebook protocol plugin for bitlbee"
DESCRIPTION = "The Facebook protocol plugin for bitlbee. This plugin uses the Facebook Mobile API."
LICENSE = "GPL-2.0-only"

PV = "1.2.2+git.1614281748.a31ccbe"

RPM_NAME = "bitlbee-facebook-1.2.2+git.1614281748.a31ccbe-1.20.aarch64.rpm"
RPM_HASH = "d7e245621a47928279e0115809d54c9508a8b465cdd7b2347ca8ef1f7788e21a18137e30b218b6d8203ef858bd140deea5a8130edcf5339a2239f989963e0014"

RPROVIDES:${PN} += "bitlbee-facebook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
