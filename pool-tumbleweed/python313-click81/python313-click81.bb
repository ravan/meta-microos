SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.8"

RPM_NAME = "python313-click81-8.1.8-1.4.noarch.rpm"
RPM_HASH = "2990feb09f8186e0c581176830ddc157f717cad3ad5c774b3918e39f18240297f4a29233409b5936d5b73e195fc79c00d0e53b25c7a0219ff735c3f4d6f6a7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click \
python3-click81 \
python3.13dist-click \
python313-click \
python313-click81 \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
