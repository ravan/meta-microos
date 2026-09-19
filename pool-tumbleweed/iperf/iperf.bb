SUMMARY = "A tool to measure network performance"
DESCRIPTION = "Iperf is a tool for active measurements of the maximum achievable bandwidth \
on IP networks. It supports tuning of various parameters related to timing, \
protocols, and buffers. For each test it reports the bandwidth, loss, and \
other parameters. \
 \
This version, sometimes referred to as iperf3, is a redesign of an original \
version developed at NLANR/DAST. iperf3 is a new implementation from scratch, \
with the goal of a smaller, simpler code base, and a library version of the \
functionality that can be used in other programs. iperf3 also a number of \
features found in other tools such as nuttcp and netperf, but were missing \
from the original iperf. These include, for example, a zero-copy mode and \
optional JSON output. \
 \
Note that iperf3 is NOT backwards compatible with the original iperf."
LICENSE = "BSD-3-Clause"

PV = "3.21"

RPM_NAME = "iperf-3.21-1.3.aarch64.rpm"
RPM_HASH = "b3e0983438c53a8713c0bc55a67990ff68ab5d32569293ea9d91f246f29707aeff3ab2ea2a682838a7efe61f8d1096459d5ddb00a12da5ff1dc23183e31ca439"

RPROVIDES:${PN} += "iperf"

RDEPENDS:${PN} += "libc.so.6 \
libiperf.so.0 \
libiperf0"

inherit rpm
