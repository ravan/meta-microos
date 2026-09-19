SUMMARY = "GNOME service to access online accounts"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.58.1"

RPM_NAME = "gnome-online-accounts-3.58.1-1.3.aarch64.rpm"
RPM_HASH = "08f068d3f01464c68f4e8af1ac18c098fbc5de47c266a2b7c6981ee41caac227c43b495b056f2ceac832041e08b3f81b22665b5ae5ecc9374ff4a8099dc2ac3d"

RPROVIDES:${PN} += "gnome-online-accounts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgoa-backend-1.0.so.2 \
libgobject-2.0.so.0 \
libkeyutils.so.1 \
libkrb5.so.3 \
librest-1.0.so.0 \
p11-kit"

inherit rpm
