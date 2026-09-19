SUMMARY = "Qt 6 SpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-spatialaudio-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "fce125d86936260e29b59592a640403c555872ff122fdd502c42f513413cd1353aa2c1c9bbc35b75ac6334066f9e01c9d2841dc6d3dd561b12088a6d7979bbc5"

RPROVIDES:${PN} += "cmake-Qt6SpatialAudio \
pkgconfig-Qt6SpatialAudio \
qt6-spatialaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Multimedia \
libQt6SpatialAudio6 \
pkgconfig-Qt6Multimedia"

inherit rpm
