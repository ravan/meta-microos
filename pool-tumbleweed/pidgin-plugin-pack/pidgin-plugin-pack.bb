SUMMARY = "Compilation of plugins for Pidgin"
DESCRIPTION = "The Purple Plugin Pack is a compilation of plugins for the \
libpurple family of IM clients. \
 \
This package provides the Pidgin plugins from the Purple Plugin Pack. \
 \
To avoid licence issues between GPLv+ plugins and other plugins \
that could be incompatible with GPLv3+, the GPLv3+ plugins are split \
into the pidgin-plugin-pack-extras package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "pidgin-plugin-pack-2.8.0-2.3.aarch64.rpm"
RPM_HASH = "ee9c46d99096caedf8fde0566b3fc2906b43b8eb5664fc503c0f4ef79dc22ba5c5b068536117a600166b814f9610736e57acafa12c5e7f767abe9f5f835ca4e0"

RPROVIDES:${PN} += "pidgin-plugin-pack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpurple-plugin-pack \
libpurple.so.0 \
pidgin"

inherit rpm
