SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.8"

RPM_NAME = "python314-click81-8.1.8-1.4.noarch.rpm"
RPM_HASH = "939ebe3570c67d55a773bdb78b6d195a913f6715a9f8ca2a767e9b646c91b2653435355fbf979402afb941ae643aad4d75957cc5df486628cad48536ae8f07fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click \
python314-click \
python314-click81 \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
