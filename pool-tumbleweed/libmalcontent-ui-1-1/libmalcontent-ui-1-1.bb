SUMMARY = "Malcontent UI library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.1"

RPM_NAME = "libmalcontent-ui-1-1-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "66a33499e7c9619babadb73e06d0c35b2568fbc5410c49b5b64756d039e5f2d23a114cde83b8d9f150bcc57b970bc528ff0094e8fbf3ecffee59dfed173c4e2e"

RPROVIDES:${PN} += "libmalcontent-ui-1-1 \
libmalcontent-ui-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libadwaita-1.so.0 \
libappstream.so.5 \
libc.so.6 \
libflatpak.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libmalcontent-0.so.0"

inherit rpm
