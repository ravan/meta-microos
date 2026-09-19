SUMMARY = "Utility functions library for the LibBlockDev library"
DESCRIPTION = "This library provides utility functions used by the LibBlockDev library \
and its plugins."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_utils3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "8928299fb57d206680fdce1ebca1193a8172afcb52fa3b3a1f0cc5af85b3910ad178a2e53b45de6d85d56c6c3726f75b2bd2876671eb0ee113eadd316883e893"

RPROVIDES:${PN} += "libbd-utils.so.3 \
libbd-utils3 \
libblockdev-utils"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkmod.so.2 \
libudev.so.1"

inherit rpm
