SUMMARY = "Arabic Free and Open Source Fonts"
DESCRIPTION = "Arabic TrueType fonts collected by Arab Eyes (www.arabeyes.org)."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "arabic-ae-fonts-2.0-18.23.noarch.rpm"
RPM_HASH = "14b7e3894add498d327bafd43e766e77878fbde2edff440e68f51e3700ebffebb195ecda6403f59898dcd6579e61359b4ebd50204073130506a4448f43beb902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-ae-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
