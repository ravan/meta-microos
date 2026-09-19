SUMMARY = "Qt 6 Quick3DXr library"
DESCRIPTION = "Adds OpenXR support for applications using QtQuick3D."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DXr6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6ad270f3246e3cb523f34ddd2a5415ea3f9a8f102e844d49ad3596ac060bbb4869e7650e056832859761d415c9edb9deb48387ed71e0a112d4382c9a1d4083e5"

RPROVIDES:${PN} += "libQt6Quick3DXr.so.6 \
libQt6Quick3DXr6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
