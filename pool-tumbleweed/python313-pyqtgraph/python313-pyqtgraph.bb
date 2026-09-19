SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python313-pyqtgraph-0.14.0-3.2.noarch.rpm"
RPM_HASH = "748b3c736e16041fea7408a4141b65d93aeb7be66c7d7d8a672b801354201772d79a678586ce2daaab382802d2f01ba6b69e11e54f14b58bc238fc40969b8912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyqtgraph \
python3.13dist-pyqtgraph \
python313-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python313-colorama \
python313-numpy"

inherit rpm
