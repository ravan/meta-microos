SUMMARY = "Data files for SuperTuxKart"
DESCRIPTION = "Data files for SuperTuxKart a Free 3d kart racing game."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "supertuxkart-data-1.5-1.6.noarch.rpm"
RPM_HASH = "f4381bc8ecb1fa7ba844c5c0e6e235ddbdddc7ae7471d327d52a6dc9d764ec607c39cbbe375c4e5db67cccb2a6c4188a71d233754cc245e27f08d967b0ff6bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supertuxkart-data"

RDEPENDS:${PN} += "supertuxkart"

inherit rpm
