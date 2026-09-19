SUMMARY = "OpenCV video sources and filters plugins"
DESCRIPTION = "These plugins may cause slow exports due to multiprocessing issues \
in kdenlive and shotcut. plugins facebl0r and facedetect. \
See boo#1068792"
LICENSE = "GPL-3.0-or-later"

PV = "3.5.0"

RPM_NAME = "frei0r-plugins-opencv-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "f712f9b4b8394b78ce4111fdab5e06ca652f3eeacb126ffe01fc70c269848f62fa8cf96ce8ae0816f1788f82105808ee11517d2e9f03d731d20301e42b92cbc7"

RPROVIDES:${PN} += "frei0r-plugins-opencv"

RDEPENDS:${PN} += "frei0r-plugins \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libopencv-objdetect.so.413 \
libopencv-video.so.413 \
libstdc++.so.6"

inherit rpm
