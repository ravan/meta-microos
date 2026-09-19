SUMMARY = "Python cairo bindings based on cffi"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python313-cairocffi-1.7.1-3.4.noarch.rpm"
RPM_HASH = "3ae95cccacf652772877f11cb9d165d095852890a70f3f427bccc4f57f8f0d5b418dbbb6e42ed459e8593276d3b17b9e5d2f87f7edea80b642d37eb12b4c896c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cairocffi \
python3.13dist-cairocffi \
python313-cairocffi \
python3dist-cairocffi"

RDEPENDS:${PN} += "cairo \
python-abi \
python313-cffi \
python313-xcffib"

inherit rpm
