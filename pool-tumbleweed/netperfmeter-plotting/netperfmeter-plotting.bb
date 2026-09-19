SUMMARY = "Network Performance Meter (plotting program)"
DESCRIPTION = "NetPerfMeter is a network performance meter for the UDP, \
TCP, MPTCP, SCTP and DCCP transport protocols over IPv4 and IPv6. \
It simultaneously transmits bidirectional flows to an endpoint \
and measures the resulting flow bandwidths and QoS. The \
results are written as vector and scalar files. The vector \
files can e.g. be used to create plots of the results. \
 \
This package contains a plotting program for the results."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.11"

RPM_NAME = "netperfmeter-plotting-2.0.11-1.1.noarch.rpm"
RPM_HASH = "dd1f69e0ae206ba9c8e1e4aa703d5c4eac003089ca1f00a095fb28ff111b8d6ce13a6a8a55a5f144c93d2d3bbf1d5893a9348e0318098f20234441ec66206eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netperfmeter-plotting"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
R-core \
netperfmeter \
netperfmeter-pdfproctools"

inherit rpm
