SUMMARY = "Qt backend for python313-matplotlib"
DESCRIPTION = "This package includes the Qt-based backend \
for the python313-matplotlib plotting package \
PyQt6 or Pyside 6 may be used. \
PyQt5 and Pyside2 still work, but are not supported by openSUSE anymore."
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-qt-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "aa5b4b4b2c3410d8459d8f1536c72353dcbb5d30f2f8d07c34ed993d99ef050733d01c1f134dc9de1f7706ef401339b04cbadd6ba0a92d69a1b119064b44bafd"

RPROVIDES:${PN} += "python3-matplotlib-qt \
python3-matplotlib-qt-shared \
python3-matplotlib-qt5 \
python3-matplotlib-qt6 \
python313-matplotlib-qt \
python313-matplotlib-qt-shared \
python313-matplotlib-qt5 \
python313-matplotlib-qt6"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib"

inherit rpm
