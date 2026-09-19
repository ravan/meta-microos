SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library and tools."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-shadertools-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "225e80c0ff0192d3d802019c7fea98fd3b30b23a397506c17f0ae5c807dd14d94cb5096cf9f9cffe4b74700c3a28c398356d20ae072b64aa6505749ae9581f9d"

RPROVIDES:${PN} += "qt6-shadertools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libstdc++.so.6 \
spirv-tools"

inherit rpm
