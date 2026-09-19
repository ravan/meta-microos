SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpersImpl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dhelpersimpl-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7a3b294414c0caa3e0e6ce8944fb8f9fd3d4b4efae3295babbe16519917ff20fcb0a0e1b2afc64870c2869e06c66987c665c51e7673bba7b4d34810862526b43"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpersImplPrivate \
qt6-quick3dhelpersimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpersImpl"

inherit rpm
