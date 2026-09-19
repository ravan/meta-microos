SUMMARY = "The Btrfs plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides Btrfs-related functionality."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_btrfs3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "64efd230f987691a8e5eb9c8365463c80e776c57728634f715adefc6253d3032d4c37f61289e19f9609c874d5f63f66578e6e10184d76d19b60bf76a0d141c8e"

RPROVIDES:${PN} += "libbd-btrfs.so.3 \
libbd-btrfs3 \
libblockdev-btrfs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libbytesize.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
