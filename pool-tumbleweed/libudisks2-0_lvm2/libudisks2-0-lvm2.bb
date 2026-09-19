SUMMARY = "UDisks module for LVM2"
DESCRIPTION = "This package contains the UDisks module for LVM2 support."
LICENSE = "LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "libudisks2-0_lvm2-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "b20822e6fb8ec864cf5901ca9e9654d630e1d3a3a7d3740c1efb24d014cb0eb7e1f5e02e38e0764a27125d8d269340b96bc2e90cd73846d232a727e390d0f8f3"

RPROVIDES:${PN} += "libudisks2-0-lvm2 \
libudisks2-lvm2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libbd-utils.so.3 \
libblkid.so.1 \
libblockdev-lvm \
libblockdev.so.3 \
libc.so.6 \
libeconf.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libmount.so.1 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
libudisks2-0 \
libudisks2.so.0 \
libuuid.so.1 \
lvm2"

inherit rpm
