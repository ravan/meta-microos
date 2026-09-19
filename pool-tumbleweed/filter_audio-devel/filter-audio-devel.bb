SUMMARY = "Development headers for filter_audio"
DESCRIPTION = "An audio filtering library made from WebRTC code. \
 \
This package provides development headers for filter_audio."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "filter_audio-devel-0.0.1-2.23.aarch64.rpm"
RPM_HASH = "dd4724a770be7aabf5b204b3bea2d8eeba54d2a40e5c200f49711f04011e95818bbe159c4ba2d3af9d0f6ceca1ab5d7f0b2ecc6f23a922c0041ab141d8308ccf"

RPROVIDES:${PN} += "filter-audio-devel \
pkgconfig-filteraudio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfilteraudio0"

inherit rpm
