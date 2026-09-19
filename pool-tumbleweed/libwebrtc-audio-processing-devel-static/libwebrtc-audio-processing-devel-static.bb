SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "2.1+git.4"

RPM_NAME = "libwebrtc-audio-processing-devel-static-2.1+git.4-2.8.aarch64.rpm"
RPM_HASH = "4a42da6289d73670f48c302dd9fe7f5a9d79e6a4be9307880fd3e2a91d761bfa7cde920bedf631342cabc94a2659b7da47349629a91617e708a37204caff6dbe"

RPROVIDES:${PN} += "libwebrtc-audio-processing-devel-static"

RDEPENDS:${PN} += "libwebrtc-audio-processing-devel"

inherit rpm
