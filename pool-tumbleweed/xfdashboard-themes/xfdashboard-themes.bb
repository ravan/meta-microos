SUMMARY = "Themes for Xfdashboard"
DESCRIPTION = "Additional themes for use with Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "xfdashboard-themes-1.1.0-1.4.noarch.rpm"
RPM_HASH = "b5a50c6c1b3953c1ed2af4d72df895a5403753b6ac0b99c7f30d06c95046b2d5eb2f53cd67cc3ec05b1cc380a4e062cfa7f5ba65ce5032b7bb821440310d81bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfdashboard-themes"

RDEPENDS:${PN} += "xfdashboard"

inherit rpm
