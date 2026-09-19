SUMMARY = "Financial instruments for Octave"
DESCRIPTION = "Financial manipulation, plotting functions and additional date manipulation tools. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.4"

RPM_NAME = "octave-forge-financial-0.5.4-1.7.noarch.rpm"
RPM_HASH = "361735b6828555a888dea477497679f502acce94b70086b00b2be9a7ac6e8bfefc4880a5a4b6f5f7f736b7404d298e59bf5bf9db670a392946b4d018735a6511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-financial"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-io \
octave-forge-statistics"

inherit rpm
