SUMMARY = "Non-ABI stable experimental API for the Qt5 3D library"
DESCRIPTION = "This package provides private headers of libqt5-qt3d that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qt3d-private-headers-devel-5.15.19+kde0-1.2.noarch.rpm"
RPM_HASH = "93cadf8db2547f0fb9ba952c15af8e8f1b41cca4c9dd8b14648968b85a1ba25e1ccbbfa8f9ad62c2c60ec9b132a3dbe02d0efecfe650c1d949f9ca8e6521393f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qt3d-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5OpenGLExtensions-devel-static \
libqt5-qt3d-devel \
libqt5-qtdeclarative-private-headers-devel"

inherit rpm
