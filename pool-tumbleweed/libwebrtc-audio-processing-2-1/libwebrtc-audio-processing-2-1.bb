SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "2.1+git.4"

RPM_NAME = "libwebrtc-audio-processing-2-1-2.1+git.4-2.8.aarch64.rpm"
RPM_HASH = "58c1454b12ed3dd65b18d34d6a1976ce908824dfda75a62611a5d5f72808ae01243d5dbbf482fe983b46dc795fe2a6b194c34af15565dc102766625830b7972b"

RPROVIDES:${PN} += "libwebrtc-audio-processing-2-1 \
libwebrtc-audio-processing-2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
