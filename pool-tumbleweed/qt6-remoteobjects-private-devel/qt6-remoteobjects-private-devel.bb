SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjects library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjects that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjects-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c3bb53752d20f7acfa613b367208f757b63c86f7e33577fe35d1bfb98a05e1b47bda19179556cf1d25fcb09524f840835ab1ef3bce3df49929a69ef8f01f99b0"

RPROVIDES:${PN} += "cmake-Qt6RemoteObjectsPrivate \
qt6-remoteobjects-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6RemoteObjects"

inherit rpm
