SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.4.2"

RPM_NAME = "python311-click-8.4.2-1.1.noarch.rpm"
RPM_HASH = "d05be63fba381859cee070dad0d248b367b780d55931f0db604eaf9952af4de9108d922a451f7e9dbc35fc1d678448de597c6aa3040df87868859f5560d2542a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-click \
python311-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
