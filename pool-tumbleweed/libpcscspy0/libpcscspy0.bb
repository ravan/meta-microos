SUMMARY = "PC/SC Smart Card Library"
DESCRIPTION = "Supporting library for the PC/SC spy tool."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.3"

RPM_NAME = "libpcscspy0-2.3.3-2.4.aarch64.rpm"
RPM_HASH = "8b7dc95f39f93ca165fb03596c6d390d6ae2c1a30035b0f6912aa13eb60cd73ede19705187179f2677db367728e1ebe09d7ea13e20df5cc85872f9f1aa6532dd"

RPROVIDES:${PN} += "libpcscspy.so.0 \
libpcscspy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
