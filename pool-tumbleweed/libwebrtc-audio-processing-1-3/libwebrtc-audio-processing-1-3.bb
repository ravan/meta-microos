SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libwebrtc-audio-processing-1-3-1.3-2.6.aarch64.rpm"
RPM_HASH = "db4b594a28bbe8eaebaa4b0fd2c9c0bfca4cd50ff51da8fc0952c45ead55b2130d686cb5ec7aa0e2122f1f4fce849a8a8546b814cf9ad8e00f782b89c59f3962"

RPROVIDES:${PN} += "libwebrtc-audio-processing-1-3 \
libwebrtc-audio-processing-1.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
