SUMMARY = "LIVE555 Streaming Media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2026.08.25"

RPM_NAME = "live555-devel-2026.08.25-1.1.aarch64.rpm"
RPM_HASH = "890a252f218120a5a9b19e963481261b354d4565a1eb77d2865b73dcd1d35349b528466970deef9260db6f72c8c49df04eae1fd691357ea14fba6e9df50d1f87"

RPROVIDES:${PN} += "live555-devel \
pkgconfig-live555"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libBasicUsageEnvironment2 \
libUsageEnvironment3 \
libgroupsock33 \
libliveMedia120 \
pkgconfig \
pkgconfig-openssl"

inherit rpm
