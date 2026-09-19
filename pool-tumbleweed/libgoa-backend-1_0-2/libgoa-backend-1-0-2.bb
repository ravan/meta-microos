SUMMARY = "GNOME service to access online accounts -- Backend Library"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.58.1"

RPM_NAME = "libgoa-backend-1_0-2-3.58.1-1.3.aarch64.rpm"
RPM_HASH = "0412b117dc50c9767cb308fef0bced807495dbc8e0604ae2e7232d47b67f6b93980a2bc282981b7e18e4f57a92da47098b5f066a2eeec10c7e16bd31651391c7"

RPROVIDES:${PN} += "libgoa-backend-1-0-2 \
libgoa-backend-1.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
librest-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
