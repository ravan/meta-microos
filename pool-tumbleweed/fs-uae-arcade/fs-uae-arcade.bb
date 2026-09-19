SUMMARY = "Fullscreen game browser for FS-UAE"
DESCRIPTION = "FS-UAE Arcade is a fullscreen Amiga game browser for FS-UAE."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.63"

RPM_NAME = "fs-uae-arcade-3.1.63-1.22.noarch.rpm"
RPM_HASH = "96eb7309fb7bb55a20ce72523418d1c735343917aee4c8b543b6ce32f616d2295f0add3b733fd9f899828824f2ed071b332bc219af45004f4ea059bdd4de23b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fs-uae-arcade"

RDEPENDS:${PN} += "/usr/bin/python3 \
fs-uae \
python3-opengl \
python3-qt5 \
python3-requests"

inherit rpm
