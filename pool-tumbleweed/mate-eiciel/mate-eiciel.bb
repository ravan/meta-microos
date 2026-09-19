SUMMARY = "ACL viewer and editor for MATE"
DESCRIPTION = "MATE eiciel is a Graphical editor for access control lists (ACLs) \
and extended attributes (xattr), either as an extension within \
Caja, or as a standalone utility."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "mate-eiciel-1.20.1-2.22.aarch64.rpm"
RPM_HASH = "522c3a3f788719f017f3fb9895b6ca459a9225a864f61f7f37ba4fedf9cb268b1552901552d6deb292fa26d0315c175e215cc6271de9120e5faac2d3ce9150f9"

RPROVIDES:${PN} += "mate-eiciel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
