SUMMARY = "Python bindings for the Qt5 3D framework"
DESCRIPTION = "PyQt3D is a set of Python bindings for the Qt 3D framework."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qt3d-qt5-5.15.6-3.8.aarch64.rpm"
RPM_HASH = "7f888cb8cee4348ca1556a713303fce841352c535da8ba807656d6e9042cbfd809488595c25fe2cc366f839a8bddeb3e66ec6b022456dbf26368d69b93b10bcb"

RPROVIDES:${PN} += "python3-PyQt3D \
python3-qt3d-qt5 \
python3.13dist-pyqt3d \
python313-PyQt3D \
python313-qt3d-qt5 \
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
python313-qt5 \
python313-qt5-sip"

inherit rpm
