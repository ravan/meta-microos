SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libwebrtc-audio-coding-1-3-1.3-2.6.aarch64.rpm"
RPM_HASH = "2bcc36451f2ddff6ff02e18db42a0779c328e05e953650bebddfb2970e3a23de73167369bc7f54d31f80c97f1f71f736e4f5bfa3c40c2f413b9a550287987afb"

RPROVIDES:${PN} += "libwebrtc-audio-coding-1-3 \
libwebrtc-audio-coding-1.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
