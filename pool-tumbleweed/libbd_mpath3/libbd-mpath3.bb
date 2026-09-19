SUMMARY = "The multipath plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to multipath devices."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_mpath3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "ce7956f57078261c06a5c209ef2abba6fdddecefb21824b8fb58decb758d57f35f12259a294279d67634c1fa726e8eb2e18e0f55a25a1db5183762be86758b3c"

RPROVIDES:${PN} += "libbd-mpath.so.3 \
libbd-mpath3 \
libblockdev-mpath"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libdevmapper.so.1.03 \
libglib-2.0.so.0 \
multipath-tools"

inherit rpm
