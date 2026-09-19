SUMMARY = "Development files for libbraille"
DESCRIPTION = "Libbraille is a computer shared library which makes it possible to \
develop for Braille displays. It provides an API to \
write text on the display, directly draw dots, or get the value of \
keys pressed on the Braille keyboard."
LICENSE = "LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "libbraille-devel-0.19.0-26.8.aarch64.rpm"
RPM_HASH = "5d0895218b309d23dc1e73dbfb6bea204f73662435b1da362d2a2151e37b8895766289814045bee89221f4bacfa405bd39d9a657fc1623bc8b20890d65b39d77"

RPROVIDES:${PN} += "libbraille-devel"

RDEPENDS:${PN} += "libbraille"

inherit rpm
