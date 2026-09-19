SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.4.2"

RPM_NAME = "python313-click-8.4.2-1.1.noarch.rpm"
RPM_HASH = "6728d71cc6c06db6c2febede205b6b1c235952f689d4a2b6650674e25bbcf158962f7feddb69c41f1b41b4f6f9f5b8ccfcdf3813f58a28ce9e9687dd22d26921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click \
python3.13dist-click \
python313-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
