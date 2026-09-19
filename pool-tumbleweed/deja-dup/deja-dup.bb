SUMMARY = "Simple backup tool and frontend for duplicity"
DESCRIPTION = "Déjà  Dup is a simple backup tool. It hides the complexity of doing \
backups the 'right way' (encrypted, off-site, and regular) and uses \
duplicity as the backend. \
 \
Features: \
 * Support for local or remote backup locations, including Amazon S3 \
 * Securely encrypts and compresses your data \
 * Incrementally backs up, letting you restore from any particular backup \
 * Schedules regular backups \
 * Integrates well into your GNOME desktop"
LICENSE = "GPL-3.0-or-later"

PV = "50.2"

RPM_NAME = "deja-dup-50.2-1.1.aarch64.rpm"
RPM_HASH = "7e5bc3de60a8d0a9a6269f9f99e40cc41fd1c1be38c6e6993dfbe5920be5673a8e38b7a2f6147c2d8a48a0d88785cd8ae8eb04781770ee4fb5251225871f4bbf"

RPROVIDES:${PN} += "deja-dup \
libdeja.so"

RDEPENDS:${PN} += "/usr/bin/sh \
duplicity \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libpackagekit-glib2.so.18 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
python3-oauthlib"

inherit rpm
