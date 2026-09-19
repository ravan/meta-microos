SUMMARY = "A library for low-level manipulation with block devices"
DESCRIPTION = "The LibBlockDev is a C library with GObject introspection support that can be \
used for doing low-level operations with block devices, like setting up LVM, \
BTRFS, LUKS or MD RAID. The library uses plugins (LVM, BTRFS,...) and serves as \
a wrapper around its plugins' functionality. All the plugins, however, can \
be used as standalone libraries. One of the core principles of LibBlockDev is \
that it is stateless from the storage configuration's perspective (e.g. it has \
no information about VGs when creating an LV)."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libblockdev-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "69759615be172c0662d9ed996084d7bebaf40bf14c44895121103456111a8cdea600a08f135c0323fd18f56d475e18c7570d8cbd7b8e5ba2b9cddf3ac4db0f9d"

RPROVIDES:${PN} += "config-libblockdev \
libblockdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblockdev-lvm \
libblockdev.so.3 \
libblockdev3 \
libbytesize.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libparted-fs-resize.so.0 \
libparted.so.2"

inherit rpm
