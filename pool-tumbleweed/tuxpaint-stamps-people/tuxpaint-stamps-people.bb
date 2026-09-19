SUMMARY = "People stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-people package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-people-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "1eebb85d40ff775c8d2913aef8a99531714fa840a14295ede4e0242f50fe1553270fe3833d23f8421f3825dd52745f55d0ed98a40aaf9d5522f1c3fc59c0c806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-people"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
