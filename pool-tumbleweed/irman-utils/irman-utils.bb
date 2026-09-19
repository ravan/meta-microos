SUMMARY = "Library for irman access"
DESCRIPTION = "Utilities from libirman from the lirc project."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "irman-utils-0.5.2-6.3.aarch64.rpm"
RPM_HASH = "26734f8894e8e4093000353e27bcc26378a14268df0c2744c03373cda88627c234d0b81e66051e99ca9659cca7b011ab12c8847c6c64deeb1246d4a2373aa41b"

RPROVIDES:${PN} += "irman-utils \
libirman-utils"

RDEPENDS:${PN} += "irman-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libirman.so.0"

inherit rpm
