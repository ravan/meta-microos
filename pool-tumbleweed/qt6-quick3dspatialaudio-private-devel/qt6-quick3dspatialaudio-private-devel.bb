SUMMARY = "Qt 6 Quick3DSpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DSpatialAudio private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dspatialaudio-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f185e97043e6567f3bf0c2c3355de74cc700001d118ee31c38d41ce2a99b8d26ae9b62595b2b4189abc349d77ce9b3e433075b8741a9cbfd4486f7ee7e871338"

RPROVIDES:${PN} += "cmake-Qt6Quick3DSpatialAudioPrivate \
qt6-quick3dspatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3D \
cmake-Qt6Quick3DPrivate \
cmake-Qt6SpatialAudio \
libQt6Quick3DSpatialAudio6"

inherit rpm
