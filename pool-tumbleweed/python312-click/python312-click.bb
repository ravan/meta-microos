SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.4.2"

RPM_NAME = "python312-click-8.4.2-1.1.noarch.rpm"
RPM_HASH = "392e5b22f9a7dde1b4c97314159e6ffd4c4f36069d7a2784c83f5db84a4960730794bb0f316f2ec651e83cfa769d84d0271309782171317b201878894f9d23c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-click \
python312-click \
python3dist-click"

RDEPENDS:${PN} += "python-abi"

inherit rpm
