SUMMARY = "Multimedia"
DESCRIPTION = "Multimedia players, sound editing tools, video and image manipulation applications."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-multimedia-20201106-5.5.aarch64.rpm"
RPM_HASH = "77aef5d7981bc4285c1c1b951fcced63482ce72332b3f0d541cd2e14922b235d2350fabeb9f49fb243d748a5fc27666e1d8645168b1df04812d9941b10835298"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-desktop-multimedia \
patterns-openSUSE-multimedia"

RDEPENDS:${PN} += ""

inherit rpm
