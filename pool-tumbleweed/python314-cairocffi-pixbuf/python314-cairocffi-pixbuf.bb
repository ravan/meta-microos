SUMMARY = "Python cairo bindings based on cffi - pixbuf image loader"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output. \
 \
This package provides the optional gdk-pixbuf image loader module."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python314-cairocffi-pixbuf-1.7.1-3.4.noarch.rpm"
RPM_HASH = "53a4da10a1443412bdf40f095433f40692073a6f8800431cb627961d5843ed06ac588bee024470f75a2059e0003975814ec180c46cdea11f89d3a32db8de6f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-cairocffi-pixbuf"

RDEPENDS:${PN} += "gdk-pixbuf \
python-abi \
python314-cairocffi"

inherit rpm
