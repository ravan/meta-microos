SUMMARY = "Seasonal stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-seasonal package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-seasonal-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "01bce7c21a9b6180fcad9cda61e7592445e662accc6d5647106341ceb580dbd52f89175ad4a12db4f0a5ef4e1737a6dbeba46f90eb1e100ce5bade282741035f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-seasonal"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
