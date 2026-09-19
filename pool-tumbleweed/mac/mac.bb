SUMMARY = "APE codec and decompressor"
DESCRIPTION = "Monkey’s Audio is a fast and easy way to compress digital music."
LICENSE = "BSD-3-Clause"

PV = "10.26"

RPM_NAME = "mac-10.26-1.11.aarch64.rpm"
RPM_HASH = "ac240c61aaf0beed5bbf68c782164b0d15e8b789cdf772f982c882b38cd155b88108920895a695a415ad6963c46af7e13d3615126d9d393c84e0a4bd74fef1b3"

RPROVIDES:${PN} += "libMAC.so.10 \
mac"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
