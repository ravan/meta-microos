SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libwebrtc-audio-coding-1-devel-1.3-2.6.aarch64.rpm"
RPM_HASH = "510655a94f5eebd9b93aaa7319e1f43641b2cc7c5b9f35ab88e1184d1ee3aef1133143ac6629d2fd3f0ada18d19442d7aaa31f251238ef8f1a4fe45fc1bc1e8d"

RPROVIDES:${PN} += "libwebrtc-audio-coding-1-devel \
pkgconfig-webrtc-audio-coding-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebrtc-audio-coding-1-3 \
pkgconfig-absl-bad-optional-access \
pkgconfig-absl-base \
pkgconfig-absl-flags \
pkgconfig-absl-strings \
pkgconfig-absl-synchronization"

inherit rpm
