SUMMARY = "Python bindings for the Qt5 3D framework"
DESCRIPTION = "PyQt3D is a set of Python bindings for the Qt 3D framework."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qt3d-qt5-5.15.6-3.8.aarch64.rpm"
RPM_HASH = "8f31b799ce107391dd047d9e39e841aa1f26f90c0016ff341b37da915809b5f73e6fff6bbc6bdd9b4e7f05c91b892b470729f2960a055570d842fd79c0896efd"

RPROVIDES:${PN} += "python3.14dist-pyqt3d \
python314-PyQt3D \
python314-qt3d-qt5 \
python3dist-pyqt3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-qt5 \
python314-qt5-sip"

inherit rpm
