SUMMARY = "Non-ABI stable API for the Qt 6 ShaderTools library"
DESCRIPTION = "This package provides private headers of libQt6ShaderTools that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-shadertools-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c6edb03b2f75987dbc33842131a469eb44dbe50282f4c5856b4758ffb149f8ca75791134312ada013bda3be1f3f471cb69bfcd5bed1fa58a4ef89e24b7798726"

RPROVIDES:${PN} += "cmake-Qt6ShaderToolsPrivate \
qt6-shadertools-private-devel"

RDEPENDS:${PN} += "cmake-Qt6GuiPrivate \
cmake-Qt6ShaderTools"

inherit rpm
