SUMMARY = "Video4linux test control and streaming test application"
DESCRIPTION = "qv4l2 is a test control and streaming test application for video4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.32.0"

RPM_NAME = "qv4l2-1.32.0-2.3.aarch64.rpm"
RPM_HASH = "7113f96d2b9acaa11bd33ddfba3ebe3fde6ac330b7b1ee0769459cb378255df33ac31a5f15f520239a169d5fc65efa849b60a22ced9967d9b8555fb55c95aeab"

RPROVIDES:${PN} += "qv4l2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libv4l \
libv4l2.so.0 \
libv4lconvert.so.0"

inherit rpm
