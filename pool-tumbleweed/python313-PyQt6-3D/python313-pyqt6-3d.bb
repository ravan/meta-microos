SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company's Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-3D-6.11.0-1.5.aarch64.rpm"
RPM_HASH = "c98032d5ad495d1218fe32f0a8d997a5d8777c7d7ff5962da57827faa4ba829e84a2e2724c31fb8c13c1fcd717d488ca86b5801da4cb4eac5c627a407de08def"

RPROVIDES:${PN} += "python3-PyQt6-3D \
python3-qt3d-qt6 \
python3.13dist-pyqt6-3d \
python313-PyQt6-3D \
python313-qt3d-qt6 \
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
python313-PyQt6 \
python313-PyQt6-sip"

inherit rpm
