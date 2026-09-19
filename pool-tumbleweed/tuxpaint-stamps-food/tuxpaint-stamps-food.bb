SUMMARY = "Food stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-food package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-food-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "764e3abd6e98995e26c3f27f010e3a1048e2268f0453edfd48104cf6daf83c5536b13bc2e7e14a24f0a6899d71af342d87c74dc5f37dd82914751b44332f66f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-food"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
