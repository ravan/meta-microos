SUMMARY = "Compilation of plugins for libpurple"
DESCRIPTION = "The Purple Plugin Pack is a compilation of plugins for the \
libpurple family of IM clients. \
 \
To avoid licence issues between GPLv3+ plugins and other plugins \
that could be incompatible with GPLv3+, the GPLv3+ plugins are \
split into the libpurple-plugin-pack-extras package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libpurple-plugin-pack-2.8.0-2.3.aarch64.rpm"
RPM_HASH = "c65674acc3f8335394a9b5c29042d50b4073d1553c72d86cc744f26d9cfcbb4ec3a94f18e43742683a470b7fd2c7d46010c8dec507574fc50c6a00cae4013add"

RPROVIDES:${PN} += "libpurple-plugin-pack \
purple-plugin-pack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpango-1.0.so.0 \
libpurple.so.0"

inherit rpm
