SUMMARY = "Common files for the Greybird theme"
DESCRIPTION = "The Greybird theme for GTK2/3 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral grey-ish look. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes as well as background images."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "3.23.4+git0.7e4507d"

RPM_NAME = "metatheme-greybird-common-3.23.4+git0.7e4507d-1.5.noarch.rpm"
RPM_HASH = "5d54b28249389217a8166b467473d60b8d6c143e7e1a21613a36ba05a44981976ee3e432b4be16c402c5d1a66b071afd47f424af0c56953b4e386613594393a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-greybird-common"

RDEPENDS:${PN} += ""

inherit rpm
