SUMMARY = "The SoX Resampler library"
DESCRIPTION = "The SoX Resampler library performs one-dimensional sample-rate \
conversion – it may be used, for example, to resample PCM-encoded \
audio."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "libsoxr0-0.1.3-3.5.aarch64.rpm"
RPM_HASH = "952dbddf1b2794af44ad150535b8cb0c940576745137b09dc957833d5a2729b0d3ae24a5cd0a59cd0587382d65e937368463faf5b6d9e004c0eec5b796a56c1b"

RPROVIDES:${PN} += "libsoxr.so.0 \
libsoxr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
