SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python314-python-xlib-0.33-3.10.noarch.rpm"
RPM_HASH = "a75284e1a5ea637c359eac34661b2809a9e82ff6705084575d66d43a7c894d932bcaf60cc2217d9f9a9147a2aaee9d388d6077eacb35c8787e6b5f82c6fb8eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-xlib \
python314-python-xlib \
python314-xlib \
python3dist-python-xlib"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
