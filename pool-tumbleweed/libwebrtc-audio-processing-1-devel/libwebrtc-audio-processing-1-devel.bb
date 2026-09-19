SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libwebrtc-audio-processing-1-devel-1.3-2.6.aarch64.rpm"
RPM_HASH = "9d16f2b8671b6fbc9a1cd9174d7098e30d912fde142cf7ffd77db27ce2d82fa5e9fe0e8162c469cbf858222928e82702195d9f16254901bd13a3c54a0d909839"

RPROVIDES:${PN} += "libwebrtc-audio-processing-1-devel \
pkgconfig-webrtc-audio-processing-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebrtc-audio-processing-1-3 \
pkgconfig-absl-bad-optional-access \
pkgconfig-absl-base \
pkgconfig-absl-flags \
pkgconfig-absl-strings \
pkgconfig-absl-synchronization"

inherit rpm
