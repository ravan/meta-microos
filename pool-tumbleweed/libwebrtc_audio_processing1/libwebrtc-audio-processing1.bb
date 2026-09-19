SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web. \
 \
This is a compatibility package which should only be used by applications \
that haven't be updated yet to the newer 1.x version."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "libwebrtc_audio_processing1-0.3.1-2.10.aarch64.rpm"
RPM_HASH = "6044df6455e1f7dbe5aeed933f74483c6aca12de690aa23cb8c8e6bc5a603cf479f195c69134a3a7bb43369a04b4e2756f96d0557f9f1fc123bbfaaf1b01318c"

RPROVIDES:${PN} += "libwebrtc-audio-processing.so.1 \
libwebrtc-audio-processing1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
