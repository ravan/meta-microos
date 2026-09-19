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

RPM_NAME = "libwebrtc_audio_processing-devel-0.3.1-2.10.aarch64.rpm"
RPM_HASH = "ac5e0dee25fe7c0d2f7a760a123f3115006445736aa1eb521f0c5fa251f2620facb10238512703d68bc160cd9a71770741c5e12d89847f0bd987a4babfaa683e"

RPROVIDES:${PN} += "libwebrtc-audio-processing-devel \
pkgconfig-webrtc-audio-processing"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebrtc-audio-processing1"

inherit rpm
