SUMMARY = "SPICE Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the SPICE protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-spice-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "67173319fb4b5970c42fa16071aa7cf9698ebfe60bc38f90d75fdbbc82635f97cd2cd041053b1706b7af23a28723d1d5ae5abf0d228664e5a3e7de77642bac29"

RPROVIDES:${PN} += "remmina-plugin-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
remmina"

inherit rpm
