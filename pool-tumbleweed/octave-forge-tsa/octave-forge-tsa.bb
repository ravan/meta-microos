SUMMARY = "Time Series Analysis Toolbox for Octave"
DESCRIPTION = "Stochastic concepts and maximum entropy methods for time series analysis. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "4.6.3"

RPM_NAME = "octave-forge-tsa-4.6.3-2.6.noarch.rpm"
RPM_HASH = "2fa02f093078e731c01e9cba919cdcb01d0dad97ef673c164944ccf07343828deee952f41bd35fd04a67b1ec09cee6bf03777918e656641fdab6a9198e3a66e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-tsa"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-nan"

inherit rpm
