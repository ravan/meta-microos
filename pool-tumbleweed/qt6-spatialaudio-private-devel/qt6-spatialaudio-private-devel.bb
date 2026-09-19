SUMMARY = "Non-ABI stable API for the Qt 6 SpatialAudio Library"
DESCRIPTION = "This package provides private headers of libQt6SpatialAudio that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-spatialaudio-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "def1bac9f02caf917300a9e14263a147fb0a9a14bc18cd6956c289eb8c4b35d03c89b2ed6ef27ec5e81200fcb4e51df026e52cb9e2c96df9d10c653182c08353"

RPROVIDES:${PN} += "cmake-Qt6SpatialAudioPrivate \
qt6-spatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SpatialAudio"

inherit rpm
