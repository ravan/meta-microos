SUMMARY = "Shared library for Budgie plugins"
DESCRIPTION = "Shared library for budgie plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "libbudgie-plugin0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "4471af71fd53c457e8c137cc1c3f7ded750270a6629072ffa4d382e948fa7b7b6d087a81b5466ced0b705cd667c492812144d9e8e7a2bb1434f92926972e56e6"

RPROVIDES:${PN} += "libbudgie-plugin.so.0 \
libbudgie-plugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpeas-2.so.0"

inherit rpm
