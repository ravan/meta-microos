SUMMARY = "Qt 6 3DQuickExtras library"
DESCRIPTION = "The Qt 6 3DQuickExtras library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DQuickExtras6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c840f73d7efdff1ce5d2df4c8c2b4e3e88a81ac0a1995730b20f79efa2ad1822e7e0dc9e3975937afc9ade350a96392bcb2601e3858eccc8cf0ebbbbc9b3a9ea"

RPROVIDES:${PN} += "libQt63DQuickExtras.so.6 \
libQt63DQuickExtras6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DQuick.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
