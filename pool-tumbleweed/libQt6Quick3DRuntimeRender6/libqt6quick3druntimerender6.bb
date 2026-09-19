SUMMARY = "Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "The Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DRuntimeRender6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e941cf06386d6f330913cd44a28ff3e6b338c5c96567e0889e5f7f4bb74b9171ab15b55489bb626bf340c50f3814ef0a4104fc8b7c0d428426543344a2439a69"

RPROVIDES:${PN} += "libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DRuntimeRender6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libQt6Quick3DUtils.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
