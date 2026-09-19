SUMMARY = "Xviewer send-by-mail plugin"
DESCRIPTION = "xviewer Send by Mail plugin"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugin-send-by-mail-3.4.3-1.2.aarch64.rpm"
RPM_HASH = "a2a736515f4dfd94961c4cb760639dfcc8a9a728b2fbb8c77c3841275d2bf0a79263ebe2ab2fd0b5fbd173d00abc6fa62cd762489168accef4bf8bca970d7586"

RPROVIDES:${PN} += "libsend-by-mail.so \
xviewer-plugin-send-by-mail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1 \
libxviewer.so \
xviewer-plugins-data"

inherit rpm
