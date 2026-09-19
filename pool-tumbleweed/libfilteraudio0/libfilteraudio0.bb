SUMMARY = "Audio filtering library made from WebRTC code"
DESCRIPTION = "An audio filtering library made from webrtc code. \
 \
This package provides shared libraries for filter_audio."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "libfilteraudio0-0.0.1-2.23.aarch64.rpm"
RPM_HASH = "ceed19f32e62f86f3b71045f68b970269c14716c63d431f5b6c6f15ce7f1a5a18d7c84da3cf8c602b251b9e73690bfb8e1bf51c51fdece73f28290c97ec24f4c"

RPROVIDES:${PN} += "libfilteraudio.so.0 \
libfilteraudio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
