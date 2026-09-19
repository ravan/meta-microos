SUMMARY = "A tool to measure network performance"
DESCRIPTION = "Iperf is a tool for active measurements of the maximum achievable bandwidth \
on IP networks. It supports tuning of various parameters related to timing, \
protocols, and buffers. For each test it reports the bandwidth, loss, and \
other parameters. \
 \
This package contains development files."
LICENSE = "BSD-3-Clause"

PV = "3.21"

RPM_NAME = "iperf-devel-3.21-1.3.aarch64.rpm"
RPM_HASH = "4d8f1499197efac302504c4f5602dbf326668c32f102d3f5c22c0de6561adba0b10fbdcba7580d99ff364bda3200ce7cd75ec275900092b7ca2df4fa1da00ab4"

RPROVIDES:${PN} += "iperf-devel"

RDEPENDS:${PN} += "libiperf0 \
pkgconfig-uuid"

inherit rpm
