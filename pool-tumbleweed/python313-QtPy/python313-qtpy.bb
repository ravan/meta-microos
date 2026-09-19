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

RPM_NAME = "python313-QtPy-2.4.3-3.2.noarch.rpm"
RPM_HASH = "3b7edfdb8740563ea9b67a871de41b00b362c480b17eb833c8f460f68989422608d3de5a27a2d523a0fcba40c7da603b157399e91c565eb5f722822187bc04f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtPy \
python3.13dist-qtpy \
python313-QtPy \
python3dist-qtpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-packaging \
update-alternatives"

inherit rpm
