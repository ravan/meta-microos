SUMMARY = "Development files for kImageAnnotator-Qt6"
DESCRIPTION = "Development files for kImageAnnotator-Qt6 including headers and libraries"
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "kImageAnnotator-Qt6-devel-0.7.2-1.4.aarch64.rpm"
RPM_HASH = "ee7c66841308ad11ce1cf0a1b1b767bb1a0297b3c321cd6555e590c0da95f74e0eeb58533c389ac0ef6b2d0fb778c7c6c67034946cc84a43ab2a17dd355199cf"

RPROVIDES:${PN} += "cmake-kImageAnnotator-Qt6 \
kImageAnnotator-Qt6-devel"

RDEPENDS:${PN} += "libkImageAnnotator-Qt6-0"

inherit rpm
