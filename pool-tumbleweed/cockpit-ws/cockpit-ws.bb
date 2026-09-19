SUMMARY = "Cockpit Web Service"
DESCRIPTION = "The Cockpit Web Service listens on the network, and authenticates users. \
 \
If sssd-dbus is installed, you can enable client certificate/smart card \
authentication via sssd/FreeIPA."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-ws-365-2.1.aarch64.rpm"
RPM_HASH = "67f100053acc64dd67ddaf7b3d2bd4085488fcb11c7d4cf098815b6769d5158e17827511f9bc729ccf8222b3994b15a6df458335d0d805a1db1318dcb00b9708"

RPROVIDES:${PN} += "cockpit-ws \
config-cockpit-ws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
distribution-logos \
glib2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libjson-glib-1.0.so.0 \
libpam.so.0 \
libsystemd.so.0 \
openssl \
pam-oath \
permissions \
wallpaper-branding"

inherit rpm
