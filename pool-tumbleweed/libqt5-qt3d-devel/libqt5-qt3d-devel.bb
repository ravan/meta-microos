SUMMARY = "Development files for the Qt5 3D library"
DESCRIPTION = "You need this package if you want to compile programs with qt3d."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qt3d-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "8636e075b2a13cb9f7472ed3851317151607b38bafddbe38f5d883a89bfc03b7edbf15e1e676fb699eea97c3e6585bb8144c060248d9d678272c0bcfd3366cf2"

RPROVIDES:${PN} += "libQt53dCollision-devel \
libqt5-qt3d-devel"

RDEPENDS:${PN} += "libQt53DAnimation-devel \
libQt53DCore-devel \
libQt53DExtras-devel \
libQt53DInput-devel \
libQt53DLogic-devel \
libQt53DQuick-devel \
libQt53DQuickAnimation-devel \
libQt53DQuickExtras-devel \
libQt53DQuickInput-devel \
libQt53DQuickRender-devel \
libQt53DQuickScene2D-devel \
libQt53DRender-devel"

inherit rpm
