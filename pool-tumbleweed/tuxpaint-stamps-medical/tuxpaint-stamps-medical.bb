SUMMARY = "Medical stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-medical package contains a set of 'Rubber Stamp' \
images which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-medical-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "eb836acb64c35e840f919696731e37521570c3fe07115f44880085f00d56e7d009569241f1eabc9156a4133c79d4f22ca80bd49cc1f86b241fc8bebab2ed491a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-medical"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
