SUMMARY = "Collection of Tools for Mastering Blu-ray and DVD+-RW/+-R Media"
DESCRIPTION = "The dvd+rw-tools collection of tools makes it possible to burn images to \
Blu-ray and DVD+-RW/+-R media."
LICENSE = "GPL-2.0-or-later"

PV = "7.1"

RPM_NAME = "dvd+rw-tools-7.1-64.5.aarch64.rpm"
RPM_HASH = "eeeeefe3600208141d06246d3b7d714f0409ecae30d8bc0b2e096c090a7ecfeea4d29e7320936d465e5413dc70c8aea7c22cd92078069916943c07eaedafab11"

RPROVIDES:${PN} += "dvd+rw-tools"

RDEPENDS:${PN} += "/usr/bin/mkisofs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libisoburn1 \
libstdc++.so.6"

inherit rpm
