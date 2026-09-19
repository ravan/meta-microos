SUMMARY = "The smartmontools plugin for the libblockdev library"
DESCRIPTION = "The libblockdev library plugin (and in the same time a standalone library) \
providing S.M.A.R.T. monitoring and testing functionality, based \
on smartmontools."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_smartmontools3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "545a5b89e03b12d8d65b32b7465d566294d8a436af0cb4001f4970f58932c24f0ad03dc8814ec80b2880b74c58ee4b58250dbddcac4fe6cc5fa6a67438b8504a"

RPROVIDES:${PN} += "libbd-smartmontools.so.3 \
libbd-smartmontools3 \
libblockdev-smartmontools"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
smartmontools"

inherit rpm
