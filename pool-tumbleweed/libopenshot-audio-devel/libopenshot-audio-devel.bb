SUMMARY = "Development files for libopenshot-audio"
DESCRIPTION = "The OpenShot Audio Library. \
 \
This package contains header files and libraries needed to develop \
application that use libopenshot-audio."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libopenshot-audio-devel-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "a32c024036f4f434643ab38d60aa6692b6ed87f7806672de4607ecef5dfce49a8a8ed9c881c189591001f7551b5317522777bc0f1d8273aed3a3662e4bc8a76c"

RPROVIDES:${PN} += "cmake-OpenShotAudio \
libopenshot-audio-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenshot-audio.so.10 \
libopenshot-audio10 \
libstdc++.so.6"

inherit rpm
