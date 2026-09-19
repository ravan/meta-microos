SUMMARY = "GNOME ACL viewer and editor"
DESCRIPTION = "Eiciel allows you to visually edit file ACL entries. You can add and \
remove users and groups who will be granted permissions through the \
graphical interface"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "eiciel-0.10.1-1.4.aarch64.rpm"
RPM_HASH = "3b1682d427cae13865dec46598ef057034e64fc9b63d5858918e0f12cfc293d33112e961b3d88be81d76f5cdc95b1a3bcea19d448ec67b881ff0475ce62d05f1"

RPROVIDES:${PN} += "eiciel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtkmm-4.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
