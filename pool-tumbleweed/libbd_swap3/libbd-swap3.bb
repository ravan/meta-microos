SUMMARY = "The swap plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to swap devices."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_swap3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "757dc037199e6e1b585c1d8e3e68004a6bd6d9fc7e5ab2650005daeb2e3e322176853ba122f6d86129cc054a7da9f6721066c35735f4f3f2842ec7ac7f6733ea"

RPROVIDES:${PN} += "libbd-swap.so.3 \
libbd-swap3 \
libblockdev-swap"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libblkid.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libuuid.so.1 \
util-linux"

inherit rpm
