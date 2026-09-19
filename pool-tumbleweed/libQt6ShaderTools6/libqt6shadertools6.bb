SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6ShaderTools6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e42d51a4794d841fa01f2e92fd1110bbfe56e05f2700d7bcada4100c06dd604117312e722c05e53ac84bae74fc88aa2bf9e14b248cd688dd29c3979975ab1d18"

RPROVIDES:${PN} += "libQt6ShaderTools.so.6 \
libQt6ShaderTools6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
