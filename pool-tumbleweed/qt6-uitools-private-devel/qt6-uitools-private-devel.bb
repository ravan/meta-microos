SUMMARY = "Non-ABI stable API for the Qt 6 UiTools library"
DESCRIPTION = "This package provides private headers of libQt6UiTools that do not have any \
ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-uitools-private-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "c9d6ca1ef9045fec11b7070d6eb017f9b4524e76e45b8bf9ed3948b41e0ec33e972bb0a1b7aca68ee3cfe414c857d75693cce6a159795fc3b44f201f6ef3828f"

RPROVIDES:${PN} += "cmake-Qt6UiToolsPrivate \
qt6-uitools-private-devel"

RDEPENDS:${PN} += "cmake-Qt6UiTools"

inherit rpm
