SUMMARY = "Python cairo bindings based on cffi - pixbuf image loader"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output. \
 \
This package provides the optional gdk-pixbuf image loader module."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python313-cairocffi-pixbuf-1.7.1-3.4.noarch.rpm"
RPM_HASH = "fa14eecc2d19e61400fc4cb88154863de99755f0c0a65936f2d3695012e2ae98c3d7b1cc1cdfb39eaa9b076bd569b75e0eb2dc305685a2b3f0bdcee65b63ee29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cairocffi-pixbuf \
python313-cairocffi-pixbuf"

RDEPENDS:${PN} += "gdk-pixbuf \
python-abi \
python313-cairocffi"

inherit rpm
