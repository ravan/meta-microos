SUMMARY = "Basic Usage Environment library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2026.08.25"

RPM_NAME = "libliveMedia120-2026.08.25-1.1.aarch64.rpm"
RPM_HASH = "0cecbde69a74ce144e7349fa148e0e20d0d9b187518932ee52a963656dfe9a31a4aabe7c80c8d4c76569015c4b7265cecf09d63d95a343c885503bb8bf95c193"

RPROVIDES:${PN} += "libliveMedia.so.120 \
libliveMedia120"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3"

inherit rpm
