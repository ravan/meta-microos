SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company's Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-3D-6.11.0-1.5.aarch64.rpm"
RPM_HASH = "893d7da4018e9e40a88804d04e8123286bf35cec042ade12114f8ae29c01b8b729a483c7036736ca6ff0c9195bdfcd7fe6dee52ae4bf5e14893c1e3d797dcc93"

RPROVIDES:${PN} += "python3.14dist-pyqt6-3d \
python314-PyQt6-3D \
python314-qt3d-qt6 \
python3dist-pyqt6-3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-PyQt6 \
python314-PyQt6-sip"

inherit rpm
