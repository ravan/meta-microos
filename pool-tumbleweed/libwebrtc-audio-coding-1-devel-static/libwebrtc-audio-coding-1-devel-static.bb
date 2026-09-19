SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libwebrtc-audio-coding-1-devel-static-1.3-2.6.aarch64.rpm"
RPM_HASH = "edf66798c622db4feebfd03701f12b1bbecadfd6fda8ea56541be7a4ee011c0f31176b70f0f788ba24c2e2a58f3b3a7d584c5f8863b61c2ce22ece344e414933"

RPROVIDES:${PN} += "libwebrtc-audio-coding-1-devel-static"

RDEPENDS:${PN} += "libwebrtc-audio-coding-1-devel"

inherit rpm
