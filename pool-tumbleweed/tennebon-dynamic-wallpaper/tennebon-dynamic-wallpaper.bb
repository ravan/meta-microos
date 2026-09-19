SUMMARY = "Tennebon Dynamic wallpaper for GNOME"
DESCRIPTION = "This package contains a dynamic wallpaper based on the Tennebon wallpaper. \
 \
A dynamic wallpaper changes depending on the time of the day: it is \
generally bright during the day, and dark during the night."
LICENSE = "CC-BY-SA-2.5"

PV = "1"

RPM_NAME = "tennebon-dynamic-wallpaper-1-13.24.noarch.rpm"
RPM_HASH = "cead034c15daf51ae7033ec4bf0b6f821b523d83f045d0cb77feb136af73f66584fb418a8135d57fd71964d3377390dbb092f69c80584d0ff681a6b642a3b858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tennebon-dynamic-wallpaper"

RDEPENDS:${PN} += ""

inherit rpm
