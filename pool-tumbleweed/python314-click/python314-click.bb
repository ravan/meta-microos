SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.4.2"

RPM_NAME = "python314-click-8.4.2-1.1.noarch.rpm"
RPM_HASH = "e7e66c66969e6ccbbddc3c3540882802770d761743d7843d588690cbde3283ef02cf5a2b1d808c89eece730bf33e8e6af5ce735c0f314029969d082788772357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click \
python314-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
