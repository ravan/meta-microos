SUMMARY = "Common files for the Greybird theme"
DESCRIPTION = "The Greybird theme for GTK2/3/4 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral grey-ish look. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes as well as background images."
LICENSE = "(CC-BY-SA-3.0 & GPL-3.0-or-later) | GPL-2.0-or-later"

PV = "3.23.4+git0.c1d46c3"

RPM_NAME = "metatheme-greybird-geeko-common-3.23.4+git0.c1d46c3-1.5.noarch.rpm"
RPM_HASH = "4700563a610c024c741f7a12c148f89875aaaf6fbf2c5a6f9011a11cd4605dd625f2d996fc3090ab89475c7a7265eca2ca4eeee1dda1496719e0cae58d5ff632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-greybird-geeko-common"

RDEPENDS:${PN} += ""

inherit rpm
