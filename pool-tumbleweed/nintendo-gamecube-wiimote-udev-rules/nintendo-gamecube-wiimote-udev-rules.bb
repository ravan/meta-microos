SUMMARY = "Udev rules for Nintendo GameCube and Wiimote game controllers"
DESCRIPTION = "This package contains udev rules for Nintendo GameCube and Wiimote game controllers."
LICENSE = "(Apache-2.0 | MIT) & BSD-2-Clause & libpng-2.0 & GPL-2.0-or-later"

PV = "2606a"

RPM_NAME = "nintendo-gamecube-wiimote-udev-rules-2606a-1.1.noarch.rpm"
RPM_HASH = "8fb478b663486ff95a469222089ce8ba34fa6dec0970dc5ef107c1aa024d220bd3c696f4d903fcba2b9e4c77d47ea91d0b449d62f580df55ed829ea4a931f701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nintendo-gamecube-wiimote-udev-rules"

RDEPENDS:${PN} += "udev"

inherit rpm
