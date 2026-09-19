SUMMARY = "Python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtQuick3D."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python314-qt5-quick3d-5.15.10-4.6.aarch64.rpm"
RPM_HASH = "e2fd7940d1f18ea0944796131c939525c6a9f65b304b005aebf1367d2a01079ba1d956003385300624cbaca684457e9853e91c05ed87a1dea3dfe7610d5027b3"

RPROVIDES:${PN} += "python314-qt5-quick3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Quick3D.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-qt5"

inherit rpm
