SUMMARY = "Breeze icon theme"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme."
LICENSE = "LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-breeze-icons-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "cec077b9dda2831abf7f36458ed31ed930a4cfdfe9e1be127c3ac885e716a66b44347cc639282dbbf312876be6004cc3da847c1740d8c66c1a5193d97b4055f6"

RPROVIDES:${PN} += "breeze5-icons \
kf6-breeze-icons"

RDEPENDS:${PN} += ""

inherit rpm
