SUMMARY = "Krita Build Environment"
DESCRIPTION = "Development headers and libraries for Krita."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.3.3"

RPM_NAME = "krita-devel-5.3.3-1.2.aarch64.rpm"
RPM_HASH = "2473bae552126888fca1bfdfde42d756f2ad942d7cf974617a36b09b3b4d9af7933b97a7bda4ffe446da255c0f84b03bef0d99ef89fb803e73a1240f6afe8d97"

RPROVIDES:${PN} += "krita-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
krita"

inherit rpm
