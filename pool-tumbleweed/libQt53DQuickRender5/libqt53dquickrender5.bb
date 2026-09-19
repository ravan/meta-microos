SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package provides Qt 3D QML types for rendering."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickRender5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "68ed968a5788350952cdad1e4304f3a521addc90b4e5aee3ee0e5b409a426c174fea84b9035ddf2d25c7c2fe780875d5468d0933807fec071a59ebb764ece82d"

RPROVIDES:${PN} += "libQt53DQuickRender.so.5 \
libQt53DQuickRender5 \
libQt53DQuickRenderer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
