SUMMARY = "Development files for the Qt 6 Quick3DGlslParser library"
DESCRIPTION = "Development files for the Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dglslparser-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8b2efea40e64794f8b12e61e1fa2840bf0d01af0ae41be48bbf6ebf1b6b7f4fb732ffc4b7f0b4e61f77b41db70f9ae9e7d8a887aa16ab96f3439cf560f8b073a"

RPROVIDES:${PN} += "cmake-Qt6Quick3DGlslParserPrivate \
qt6-quick3dglslparser-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libQt6Quick3DGlslParser6"

inherit rpm
