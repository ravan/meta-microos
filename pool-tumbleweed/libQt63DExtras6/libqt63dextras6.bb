SUMMARY = "Qt 6 3DExtras library"
DESCRIPTION = "The Qt 6 3DExtras library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DExtras6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3cadb9754a7e7b46819a29c5522f37375b7361d1e6d58b5f54edb7eb706ad4873d8cd98a6fbb2208f5eba7b603095d8633b6119c309c908eb98cdddcf274ed17"

RPROVIDES:${PN} += "libQt63DExtras.so.6 \
libQt63DExtras6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
