SUMMARY = "4 Player Mahjongg game"
DESCRIPTION = "Kajongg is a version of the four player Mahjongg tile game."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kajongg-26.08.1-1.1.noarch.rpm"
RPM_HASH = "370ec553586aef6f98af00f59408fdb12aff4c4d261dc3530f7f717ec2bd3cdd1ade644d03c15881c7f9b010b64c2cca1ee8167f4b3c2b88e592e770a3702401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kajongg"

RDEPENDS:${PN} += "/usr/bin/env \
python3-PyQt6 \
python3-Twisted"

inherit rpm
