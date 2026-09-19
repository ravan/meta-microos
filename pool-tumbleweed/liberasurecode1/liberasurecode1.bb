SUMMARY = "Erasure Code API library with pluggable Erasure Code backends"
DESCRIPTION = "liberasurecode is an Erasure Code API library written in C with \
pluggable Erasure Code backends."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "liberasurecode1-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "0565cd8d24ca286ac5d44169b417eccbae74708adab63f7131793a46f76be4715a9847dc0c6900baf942f48d3182f7d70f61c18dd06ec8c2f425b1c9feaa3cbd"

RPROVIDES:${PN} += "libXorcode.so.1 \
liberasurecode-rs-vand.so.1 \
liberasurecode.so.1 \
liberasurecode1 \
libnullcode.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
