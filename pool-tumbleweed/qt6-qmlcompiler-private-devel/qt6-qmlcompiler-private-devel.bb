SUMMARY = "Non-ABI stable API for the Qt 6 QmlCompiler library"
DESCRIPTION = "This package provides private headers of libQt6QmlCompiler that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlcompiler-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "0e0c0cd6802e82b7b4e795f968853519eeba06e6152c7e55b497d4ba5cce5f6f49e874be70bf9e706bf00d1d1f3048e45086f1b3675f8d70b345053698b654c4"

RPROVIDES:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qmlcompiler-private-devel"

RDEPENDS:${PN} += "qt6-qmlcompiler-devel"

inherit rpm
