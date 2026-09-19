SUMMARY = "Simple GTK+ client for managing TOTP and HOTP"
DESCRIPTION = "Highly secure and easy to use GTK+ software for two-factor authentication \
that supports both Time-based One-time Passwords (TOTP) and \
HMAC-Based One-Time Passwords (HOTP)."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.8"

RPM_NAME = "otpclient-5.1.8-1.1.aarch64.rpm"
RPM_HASH = "02b015bc28ef69b954be9f659877a693f02620eb408ac1d912a570ed6d11206c12756ffb527fd4e212504dcbe8babb1535ca45ebf945df89c056fc359a40c023"

RPROVIDES:${PN} += "otpclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcotp.so.4 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjansson.so.4 \
libprotobuf-c.so.1 \
libqrencode.so.4 \
libsecret-1.so.0 \
libuuid.so.1 \
libzbar.so.0"

inherit rpm
