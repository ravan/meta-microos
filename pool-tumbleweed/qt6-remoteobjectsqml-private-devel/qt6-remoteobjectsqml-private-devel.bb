SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjectsQml library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjectsQml that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjectsqml-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "95ff47a309fcd8463c8773c953f3a2babc1c3d880d7099836e8ed7e68d735239d2acdb748bc68811cd481dcd7055e18d697b112a5fed20af6a094b0054e1e059"

RPROVIDES:${PN} += "cmake-Qt6RemoteObjectsQmlPrivate \
qt6-remoteobjectsqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6RemoteObjectsQml"

inherit rpm
