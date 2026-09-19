SUMMARY = "Linear algebra package for Octave"
DESCRIPTION = "Additional linear algebra code, including general SVD and matrix functions. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.2.4"

RPM_NAME = "octave-forge-linear-algebra-2.2.4-1.2.noarch.rpm"
RPM_HASH = "cdfb112b1ffb17841abaceb9c6a3df2343eaa14721606ecbc7eadda37864238c3c13261bc2563018869cd0cafdabf95a418ed16664f03c3920f28c248e928139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-linear-algebra"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
octave-cli"

inherit rpm
