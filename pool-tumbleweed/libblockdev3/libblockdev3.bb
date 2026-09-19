SUMMARY = "A library for low-level manipulation with block devices"
DESCRIPTION = "The LibBlockDev is a C library with GObject introspection support that can be \
used for doing low-level operations with block devices like setting up LVM, \
BTRFS, LUKS or MD RAID. The library uses plugins (LVM, BTRFS,...) and serves as \
a wrapper around its plugins' functionality. All the plugins, however, can \
be used as standalone libraries. One of the core principles of LibBlockDev is \
that it is stateless from the storage configuration's perspective (e.g. it has \
no information about VGs when creating an LV)."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libblockdev3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "322dc53299342668f2c5567d0f2e34c0f3e00c5de8094b2c552548cb839e2231f1bf5dfd6dc26a02ae0ffed23ef451f4271553ecf2d7316d3cb2e8fd7b96bdb9"

RPROVIDES:${PN} += "libblockdev.so.3 \
libblockdev3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
