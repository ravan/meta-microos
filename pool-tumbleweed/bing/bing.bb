SUMMARY = "A Point-to-Point Bandwidth Measurement Tool"
DESCRIPTION = "Bing determines the real (raw, as opposed to available or average) \
throughput of a link by measuring ICMP echo request round trip times \
for different packet sizes for each end of the link."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "bing-1.0.5-164.5.aarch64.rpm"
RPM_HASH = "1d7f5190f7966a370181fc64a11ea2829714e308d16252848f4b79a5c345cc361a71b1639739cede8d7a10de48566aa609db6b296e11da8daa20c2463d790532"

RPROVIDES:${PN} += "bing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
