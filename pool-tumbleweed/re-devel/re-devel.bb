SUMMARY = "Development files for libre"
DESCRIPTION = "Libre is a portable and generic library for real-time communications \
with async I/O support and a complete SIP stack with support for protocols \
such as SDP, RTP/RTCP, STUN/TURN/ICE, BFCP, HTTP and DNS Client. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libre."
LICENSE = "BSD-3-Clause"

PV = "4.11.0"

RPM_NAME = "re-devel-4.11.0-1.1.aarch64.rpm"
RPM_HASH = "429330b18820ab6b64ac8bebc7cd32d188f8f892cb3f9108c61a25e0c28d2cd2bb43fd3a780b955c752aa86c7a6b9d6a903ec57a16f215cd38663bb4774a8513"

RPROVIDES:${PN} += "cmake-libre \
cmake-re \
pkgconfig-libre \
re-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libre45 \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-zlib"

inherit rpm
