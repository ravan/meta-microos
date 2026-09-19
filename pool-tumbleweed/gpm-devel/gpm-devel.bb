SUMMARY = "Development files for gpm (Console Mouse Support)"
DESCRIPTION = "Development files for the gpm (general purpose mouse) package."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.7"

RPM_NAME = "gpm-devel-1.20.7-23.4.aarch64.rpm"
RPM_HASH = "928f5ce20b7ce08a131937b8d829a04fe405d60dda636308420d8b4a0d948243103a628ac0f8d806cfd5c97fa1c453b791d1db05e3d6daf7c2bf608264ca0cb4"

RPROVIDES:${PN} += "gpm-devel"

RDEPENDS:${PN} += "libgpm2"

inherit rpm
