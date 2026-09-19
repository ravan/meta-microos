SUMMARY = "Non-ABI stable API for the Qt 6 StateMachineQml library"
DESCRIPTION = "This package provides private headers of libQt6StateMachineQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-statemachineqml-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a0cbd90bc2e5f42b7ac85b5c546072b2534800d7b88946a35a97ddc21f8126baa30d029787e69beaa7bcbda9f9cdee4d2818e4e1600facbc2cafe7be8243bbd1"

RPROVIDES:${PN} += "cmake-Qt6StateMachineQmlPrivate \
qt6-statemachineqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachineQml"

inherit rpm
