SUMMARY = "LIVE555 Streaming Media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2026.08.25"

RPM_NAME = "live555-2026.08.25-1.1.aarch64.rpm"
RPM_HASH = "e70188390ca47867052c3f17714b9a89f28567cc5cb87e7f7c3f9e857429e43137b8abcc2b05c27166b2eac84f6832f3d3067566b2e9de34bd27aeb181d71228"

RPROVIDES:${PN} += "live555"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libBasicUsageEnvironment.so.2 \
libUsageEnvironment.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgroupsock.so.33 \
libliveMedia.so.120 \
libstdc++.so.6"

inherit rpm
