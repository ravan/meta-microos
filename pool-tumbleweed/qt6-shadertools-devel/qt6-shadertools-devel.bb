SUMMARY = "Qt 6 ShaderTools library - Development files"
DESCRIPTION = "Development files for the Qt 6 ShaderTools library"
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-shadertools-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "cf3f6f46cdd4a322dd19a1d84ce45e7dc426b71b7a49270008c030c9004eb2e4376e0a34f0842a13e231d1ffb22e5e5ed41c6c26326ea115679ec1ff59d9e252"

RPROVIDES:${PN} += "cmake-Qt6ShaderTools \
cmake-Qt6ShaderToolsTools \
pkgconfig-Qt6ShaderTools \
qt6-shadertools-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6ShaderTools6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
qt6-shadertools"

inherit rpm
