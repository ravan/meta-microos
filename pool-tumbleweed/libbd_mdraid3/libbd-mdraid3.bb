SUMMARY = "The MD RAID plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to MD RAID."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_mdraid3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "e30327e9ce7a8edd349c0575087afd856ba1f91f71f3f4979d9f16e1aaf7204862072651bc3bd227bccdf3c103d3ae2c671d7e03a3605076112e9fb547c1bd58"

RPROVIDES:${PN} += "libbd-mdraid.so.3 \
libbd-mdraid3 \
libblockdev-mdraid"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libbytesize.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
mdadm"

inherit rpm
