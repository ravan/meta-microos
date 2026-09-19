SUMMARY = "Abstraction layer on top of Qt bindings"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
It provides support for PyQt5, PyQt6, PySide6, PySide2 using the Qt5 \
layout (where the QtGui module has been split into QtGui and QtWidgets). \
Basically, you can write your code as if you were using PyQt or PySide \
directly, but import Qt modules from qtpy instead of PyQt5, PySide2, \
PyQt6 or PySide6."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "python314-QtPy-2.4.3-3.2.noarch.rpm"
RPM_HASH = "468a2b3657606de0e04bddd43b325ab261d7099d9bed0767da10025641f10901b89504d29f59e662949cb6bd9ef91af60d768f4f363c2d35735ed7d3dbaafeb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qtpy \
python314-QtPy \
python3dist-qtpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-packaging \
update-alternatives"

inherit rpm
