SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libwebrtc-audio-processing-1-devel-static-1.3-2.6.aarch64.rpm"
RPM_HASH = "f1b83ef300e0c924f69d3d3a8c7c8f2c4a2867a4a309e571d7a67de53689d8fdc7c6cb9045566bcd32bde0526f6f8a577cd346a01cfc9960d8e82a7496424e35"

RPROVIDES:${PN} += "libwebrtc-audio-processing-1-devel-static"

RDEPENDS:${PN} += "libwebrtc-audio-processing-1-devel"

inherit rpm
