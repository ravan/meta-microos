SUMMARY = "Pico editor clone with enhancements"
DESCRIPTION = "GNU nano is a small and friendly text editor. It aims to emulate \
the Pico text editor while also offering a few enhancements."
LICENSE = "GPL-3.0-or-later"

PV = "9.2"

RPM_NAME = "nano-9.2-1.1.aarch64.rpm"
RPM_HASH = "eb18975d9eb2f39bd334d0493af2bb4d016da1e7bdf40059aec7a109b37aa74e2befc38b0fa567e62ab2c70390ee66b2f4951c42a9e8394570e3c175ec74d0a9"

RPROVIDES:${PN} += "config-nano \
nano"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
