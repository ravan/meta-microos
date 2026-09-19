SUMMARY = "An LDAP Client for GTK"
DESCRIPTION = "An LDAP client for GTK."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.3"

RPM_NAME = "gq-1.2.3-94.8.aarch64.rpm"
RPM_HASH = "9002442a6758ced4c613d3fac9c0638a951965ae67d86885090bab7ec4df7a94fb8ec489b2636bd051bf92f9b426c19d2db2eb8416d791f7cfdc9c88f0bdead9"

RPROVIDES:${PN} += "gq"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblber.so.2 \
libldap.so.2 \
libpango-1.0.so.0 \
libxml2.so.16"

inherit rpm
