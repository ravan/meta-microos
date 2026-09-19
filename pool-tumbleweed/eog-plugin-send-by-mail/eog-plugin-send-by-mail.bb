SUMMARY = "Eog send-by-mail plugin"
DESCRIPTION = "The Eye of Gnome Send by Mail plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-send-by-mail-44.1-2.3.aarch64.rpm"
RPM_HASH = "9d44fbd1b4f6372669e89419dc793e69c98e0dfec3b949c20083c746d39c4c684288b15a202d1623c4923537b3ff64a5298de9be02c3e52cf0aa1ade9a7f08f3"

RPROVIDES:${PN} += "eog-plugin-send-by-mail \
eog-plugins-/usr/lib64/eog/plugins/send-by-mail.plugin \
libsend-by-mail.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeog.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1"

inherit rpm
