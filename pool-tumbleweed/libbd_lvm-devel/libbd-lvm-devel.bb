SUMMARY = "Development files for the libblockdev-lvm plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_lvm plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_lvm-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "100a0689b4b20904f0fa0e535c8b3f653a2275e6ed21f70d740e8f28daccc1942ae0043630514c2bdc39fc041557c794cb06b787ff206639971ea64d3429051f"

RPROVIDES:${PN} += "libbd-lvm-devel \
libblockdev-lvm-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-lvm3 \
libbd-utils-devel"

inherit rpm
