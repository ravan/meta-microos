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

RPM_NAME = "libwebrtc_audio_processing-devel-static-0.3.1-2.10.aarch64.rpm"
RPM_HASH = "85cac9663bab82ccd58da97fca371951b0c3c95f2d74d202247da7cba019d2f1eb00ddabfaa2bd422818dd4ff28dd403d1210a28689a06a2914b01b4ed9ced63"

RPROVIDES:${PN} += "libwebrtc-audio-processing-devel-static"

RDEPENDS:${PN} += "libwebrtc-audio-processing-devel"

inherit rpm
