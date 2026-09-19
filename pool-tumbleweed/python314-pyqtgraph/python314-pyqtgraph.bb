SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python314-pyqtgraph-0.14.0-3.2.noarch.rpm"
RPM_HASH = "c66d3a7b3fc012a778e753fd358f2e7c00f3b8cb3f8214e483481d3f819ce2921e33a3cac6102362940dca7642218aec972880df7794b9d8b819b476ba8a26fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyqtgraph \
python314-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python314-colorama \
python314-numpy"

inherit rpm
