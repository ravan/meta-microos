SUMMARY = "Qt interfaces for libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
'qcam' is a Qt interface to interact with cameras. It allows to \
query and set image stream properties, and to capture the stream \
to a file or show a live view."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libcamera-qcam-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "383f0863e9d4f4882ab48cc7d876d81b6777c76fb81105b6dd23dc57c849f87ddcd8c422b1b101d21df748de40e9d639daa64aa2c6ae3a6c053a0ea3f0939c32"

RPROVIDES:${PN} += "libcamera-qcam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcamera-base.so.0.7 \
libcamera.so.0.7 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
