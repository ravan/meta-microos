SUMMARY = "Town stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-town package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-town-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "34a29435ef215b967a0dbcf9101eef79d6521e2d17a599d5471d3d16d8284e29da02c02173ab61efd1e2f854db25e56ab297f04856cf42874be1dc1c45dc48dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-town"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
