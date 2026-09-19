SUMMARY = "GNOME interface for gnupg"
DESCRIPTION = "Seahorse is a GNOME interface for gnupg. It uses gpgme as the backend."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "47.0.1+6"

RPM_NAME = "seahorse-47.0.1+6-3.4.aarch64.rpm"
RPM_HASH = "858e85243280486a7ba6f80592f878cf429ff70f616ec8653b7856b1d4b1b5fd6b9423e367f81f6005139d4d835af62b35ed08e66756c3d5f80e40d300a47d3b"

RPROVIDES:${PN} += "seahorse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgck-1.so.0 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libldap.so.2 \
libpwquality.so.1 \
libsecret-1.so.0 \
libsoup-3.0.so.0"

inherit rpm
