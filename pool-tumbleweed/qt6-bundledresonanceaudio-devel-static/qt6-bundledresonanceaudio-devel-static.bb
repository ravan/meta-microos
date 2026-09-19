SUMMARY = "Qt6 BundledResonanceAudio static library"
DESCRIPTION = "The Qt6 BundledResonanceAudio static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-bundledresonanceaudio-devel-static-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5e1522f27718817e72ff7cb7498d3c142814063dca060ccf747eeec2010919db1fdef4359a58bf06b26e55cc1b50f2650f887c983861a123fa5a937d0ab46bd3"

RPROVIDES:${PN} += "cmake-Qt6BundledResonanceAudio \
qt6-bundledresonanceaudio-devel-static"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate"

inherit rpm
