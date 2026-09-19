SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows). \
Contains helpers needed by the spice glib client library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.43"

RPM_NAME = "libspice-client-glib-helper-0.43-1.1.aarch64.rpm"
RPM_HASH = "6541132baf7caf5577980a0f5bd9e5121d046c2f0289c0863ed004d49c53ac470618677520ff8986065dcd43553e5fdbc680695179c457956ba21229ce3f72c9"

RPROVIDES:${PN} += "libspice-client-glib-helper"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kvm \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
permissions"

inherit rpm
