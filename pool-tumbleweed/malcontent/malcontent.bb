SUMMARY = "Parental control system"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.1"

RPM_NAME = "malcontent-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "470041e4e53b2a6ddc98e24c7324b3837da7f667eb94340166b7f71f57b358fdaa841c1503e0f268d3fa64d38b94466fcddfff2574734e82735be8498767acf5"

RPROVIDES:${PN} += "malcontent"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmalcontent-0.so.0 \
libpam.so.0 \
typelib-GLib \
typelib-Gio \
typelib-Malcontent"

inherit rpm
