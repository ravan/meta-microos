SUMMARY = "Data files for extreme-tuxracer"
DESCRIPTION = "This package contains the data files for extreme-tuxracer."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4"

RPM_NAME = "extreme-tuxracer-data-0.8.4-1.9.noarch.rpm"
RPM_HASH = "6469ef2193c4ecbe4159307795b8739d04cc176f7d9dcf8a822fb9c592db31cbba50367baf07d913910c5d6c367019dc91900162a871e369c9cc3441772d7488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extreme-tuxracer-data"

RDEPENDS:${PN} += ""

inherit rpm
