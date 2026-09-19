SUMMARY = "Non-ABI stable API for the Qt 6 NetworkAuth Library"
DESCRIPTION = "This package provides private headers of libQt6NetworkAuth that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-networkauth-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "099f27bead12ba8c0b4982bb9278d444297951b31302f0b0475b08c2215aedcdee60c5377a908b89532bce650f585eaa0124c56c6129d6c87621dca912a0e0fc"

RPROVIDES:${PN} += "cmake-Qt6NetworkAuthPrivate \
qt6-networkauth-private-devel"

RDEPENDS:${PN} += "cmake-Qt6NetworkAuth"

inherit rpm
