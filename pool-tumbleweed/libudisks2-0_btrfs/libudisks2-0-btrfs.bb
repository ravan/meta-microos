SUMMARY = "UDisks module for btrfs"
DESCRIPTION = "This package contains the UDisks module for btrfs support."
LICENSE = "LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "libudisks2-0_btrfs-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "dfe847c427c5a9ca07697329660a65f1c948adb1254345c5b43773f16db9671d51e1f0c87e4727d66fd37f4beb5df006e3e9bd742791c3eca5e508b844a200d1"

RPROVIDES:${PN} += "libudisks2-0-btrfs \
libudisks2-btrfs.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libbd-utils.so.3 \
libblkid.so.1 \
libblockdev-btrfs \
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
libuuid.so.1"

inherit rpm
