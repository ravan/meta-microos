SUMMARY = "Mouse Cursors in Crystal Icon Style"
DESCRIPTION = "Four different mouse cursor icon sets in the KDE CrystalSVG style. In \
white, gray, blue, and green versions. They can be selected from KDE \
Control Center, in the mouse configuration."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9"

RPM_NAME = "Crystalcursors-0.9-4.1.noarch.rpm"
RPM_HASH = "72739f380c23fd5c77b8097c8c9b95b21edca22a33c3e053288407d297244218fe4c57f1e84724f5801cfc7f64884c0343e6f96025837b3e6b5f85d3e83795ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Crystalcursors"

RDEPENDS:${PN} += ""

inherit rpm
