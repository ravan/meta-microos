SUMMARY = "Nautilus ACL viewer and editor extension"
DESCRIPTION = "A Nautilus extension that allows viewing and editing ACL permissions."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "nautilus-eiciel-0.10.1-1.4.aarch64.rpm"
RPM_HASH = "8865f2f5c46382b95605c2a203485f33f4fcca9850f9ade77c9e110f3586dc19db7d33c594ac93f9f888ef7f63e681bc80f8497b33c3434aebbb14826582dc32"

RPROVIDES:${PN} += "libeiciel-nautilus.so \
nautilus-eiciel"

RDEPENDS:${PN} += "eiciel \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
libstdc++.so.6"

inherit rpm
