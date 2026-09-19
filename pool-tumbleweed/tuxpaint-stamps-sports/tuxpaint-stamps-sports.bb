SUMMARY = "Sports stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-sports package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-sports-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "9a4115a4fc8be7d85717ae3f18291b368677676392cac2ab3797f2d48e3f95f1cc490394bc3f3d8eae35240dc037ddf81b8a5eb91e644aa9f03fcacdba72251e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-sports"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
