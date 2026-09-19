SUMMARY = "Plants stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-plants package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-plants-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "ee462e21bac9d4f42b45b00f626aa79407b0642410dba0bd21e0afa0f3ff21491569bc1088286f0abe585a83827c762aab02d1f0c414440aeb127114e2ab0b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-plants"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
