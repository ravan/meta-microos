SUMMARY = "PyQt - devel part of python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtQuick3D"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python313-qt5-quick3d-devel-5.15.10-4.6.aarch64.rpm"
RPM_HASH = "fdf1db69ab51fd0587d723a639e7a73c21a8a1b8550507e711c4ef479ca50bdee08a033a8a4f4aaef9acb8ee856829eed28dd64962859b6d9df486f75ea5f400"

RPROVIDES:${PN} += "python3-qt5-quick3d-devel \
python313-qt5-quick3d-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5Quick3D \
python-abi \
python313-qt5-devel"

inherit rpm
