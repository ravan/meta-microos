SUMMARY = "UDisks module for LSM"
DESCRIPTION = "This package contains the UDisks module for LSM support."
LICENSE = "LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "libudisks2-0_lsm-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "9ea193aa7b08d04d8cf67b637763fc772f60a5caad3e480a9b58856a97d76633aaa0b6cebbd87a549db3e40e037f69783d75c0424fdd8408a43a91fe59ae2a3c"

RPROVIDES:${PN} += "config-libudisks2-0-lsm \
libudisks2-0-lsm \
libudisks2-lsm.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libbd-utils.so.3 \
libblkid.so.1 \
libblockdev.so.3 \
libc.so.6 \
libconfig.so.15 \
libeconf.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libmount.so.1 \
libpolkit-gobject-1.so.0 \
libstoragemgmt \
libstoragemgmt.so.1 \
libsystemd.so.0 \
libudisks2-0 \
libudisks2.so.0 \
libuuid.so.1"

inherit rpm
