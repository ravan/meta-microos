SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "2.1+git.4"

RPM_NAME = "libwebrtc-audio-processing-devel-2.1+git.4-2.8.aarch64.rpm"
RPM_HASH = "0bc5c1a2500c166f2c37a7638491de47014440223ca29f77e1104de9a2f788962bc6e62f4932b5c731e779e9075648a6df3d8c94419533104560033b5edede26"

RPROVIDES:${PN} += "libwebrtc-audio-processing-devel \
pkgconfig-webrtc-audio-processing-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebrtc-audio-processing-2-1 \
pkgconfig-absl-bad-optional-access \
pkgconfig-absl-base \
pkgconfig-absl-flags \
pkgconfig-absl-numeric \
pkgconfig-absl-strings \
pkgconfig-absl-synchronization"

inherit rpm
