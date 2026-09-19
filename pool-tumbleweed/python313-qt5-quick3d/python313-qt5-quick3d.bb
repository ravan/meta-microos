SUMMARY = "Python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtQuick3D."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python313-qt5-quick3d-5.15.10-4.6.aarch64.rpm"
RPM_HASH = "070dbe9344aad5f840970c1c7feccf7023de4a06bbb6010944f401f589d3558ed3138fae2947176d60f2df44a1cfcbb9a2499a0951b2c68fe2881af5cf7565e2"

RPROVIDES:${PN} += "python3-qt5-quick3d \
python313-qt5-quick3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Quick3D.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-qt5"

inherit rpm
