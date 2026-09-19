SUMMARY = "Non-ABI stable API for the Qt 6 StateMachine library"
DESCRIPTION = "This package provides private headers of libQt6StateMachine that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-statemachine-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4617be4bd301d04caaee716a278cddc2a7026617cdcbd288ca6a65b96fb67a96e30bbe1f3c16f171d456a160efa83848b7d0c603e0b4c87f1044e8338e8550f2"

RPROVIDES:${PN} += "cmake-Qt6StateMachinePrivate \
qt6-statemachine-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6ScxmlGlobalPrivate \
cmake-Qt6StateMachine"

inherit rpm
