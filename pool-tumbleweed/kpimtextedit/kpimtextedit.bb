SUMMARY = "KDE PIM Libraries: Text edit functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications, in \
particular those related to editing text, like email messages."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kpimtextedit-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b44e205553e9851e2c2d8250d121903d47e217f0ea65f6e9c8ff3aa153138d1e35894f1c5625b57fa3a2b81ebdb0c4ae78390e5f370279532e8ccfbc4d379559"

RPROVIDES:${PN} += "kpimtextedit"

RDEPENDS:${PN} += ""

inherit rpm
