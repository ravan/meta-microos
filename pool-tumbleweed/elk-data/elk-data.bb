SUMMARY = "Common data files for use with elk"
DESCRIPTION = "This package provides common data files for use with any flavour of \
elk."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-data-8.7.2-2.13.noarch.rpm"
RPM_HASH = "776424ccc288bd8ee9c620edd1e56426c9caa58ec6ce47759e2650b7abceaf87dcda6669baa2ece81d0525570ce26485e210f6cdbc81b8de0344c2c5936e7501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elk-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
