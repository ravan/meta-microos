SUMMARY = "Python cairo bindings based on cffi"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python314-cairocffi-1.7.1-3.4.noarch.rpm"
RPM_HASH = "8ee7c6d63d7e4e626d8920389798df34e240be8499dd5b594eda740f2f6811999ef039c14d6b1d32f828453b6f07b612573c4e8c07504bea4223eb9dbfebd069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cairocffi \
python314-cairocffi \
python3dist-cairocffi"

RDEPENDS:${PN} += "cairo \
python-abi \
python314-cffi \
python314-xcffib"

inherit rpm
