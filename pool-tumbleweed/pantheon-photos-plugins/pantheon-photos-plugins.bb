SUMMARY = "A collection of plugins for pantheon-photos"
DESCRIPTION = "The continuation of Shotwell. \
 \
This package contains a collection of plugins: publishing, transitions and etc."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-photos-plugins-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "6136e9ca5bcfb3b1f4af0eb7f1a6934f78852c0c59ccdd0fed3ad4dbab3ffe149ad4fcee9ac8c58cb4f4782d76158fbc2b5d78b8d60ec69019b1db036b2b8eab"

RPROVIDES:${PN} += "libpantheon-photos-transitions.so \
pantheon-photos-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
pantheon-photos"

inherit rpm
