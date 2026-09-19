SUMMARY = "Gajim integration for the Caja file manager"
DESCRIPTION = "This package provides Gajim integration to the Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-sendto-gajim-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "6442d5329181e2679a5527ab2acda928076496970127b37b586bfa22d7a2083e5a556b686a6590235b514255cd80cbccbb9644c7f184fa522bfa37d8dfb4b751"

RPROVIDES:${PN} += "caja-extension-sendto-gajim \
caja-sendto-gajim \
libnstgajim.so"

RDEPENDS:${PN} += "caja-extension-sendto \
gajim \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
