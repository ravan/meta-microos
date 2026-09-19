SUMMARY = "C library API for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the C library API for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.40.0"

RPM_NAME = "libmlt-7-7-7.40.0-1.1.aarch64.rpm"
RPM_HASH = "17ca886de688b873e760f39c25c7bcc9cd1b3d4d80dae79c0d765cedc095f85e9351f56c395494987594501882fb7e197460a0ed5d3e0b62f70a8299a2765128"

RPROVIDES:${PN} += "libmlt-7-7 \
libmlt-7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
