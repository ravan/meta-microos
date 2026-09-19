SUMMARY = "The Device Mapper plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to Device Mapper."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_dm3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "836578c5405690fde3b771789ff10010b1b37857bfdf468126937a73cb7bc90af119e316a7a83fa825a7a111c22db4020f2d11cf5ff1608a67c672acd8a7bce1"

RPROVIDES:${PN} += "libbd-dm.so.3 \
libbd-dm3 \
libblockdev-dm"

RDEPENDS:${PN} += "/sbin/ldconfig \
device-mapper \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libdevmapper.so.1.03 \
libglib-2.0.so.0"

inherit rpm
