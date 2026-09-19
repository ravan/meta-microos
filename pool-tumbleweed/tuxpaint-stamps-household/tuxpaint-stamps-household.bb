SUMMARY = "Household items stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-household package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-household-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "e7df428ca31ce49a337d3d946376459ac500e83b36c9a9035acb721f7207b4fa7449ce02c4d14492bc00e222ba9024fb65d2aa7d99e8d9c1c00fa4690142e1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-household"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
