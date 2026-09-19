SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python313-python-xlib-0.33-3.10.noarch.rpm"
RPM_HASH = "7c9968a0dff783b7e54b862a55426eec49d9cc3d5b03485a0e88d1034de425a1e9a040d3ea42a7d411d0c0bef50e598795b95bf4ec239aafa5501866ba54b71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-xlib \
python3-xlib \
python3.13dist-python-xlib \
python313-python-xlib \
python313-xlib \
python3dist-python-xlib"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
