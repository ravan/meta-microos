SUMMARY = "Dictionary Tool for Anthy"
DESCRIPTION = "A graphical tool to edit the personal dictionary for Anthy."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "kasumi-2.5-25.11.aarch64.rpm"
RPM_HASH = "f4806e56ac60abf797ccaef667306561b7f28e1785954096a52a0495c00288fa5fc0468d91fec1cacdc15efe6758895d11a6cd0287bed06dbe321930175d877d"

RPROVIDES:${PN} += "kasumi \
locale-anthy-ja"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libanthy.so.0 \
libanthydic.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6"

inherit rpm
