SUMMARY = "Qt 6 CanvasPainter library"
DESCRIPTION = "Accelerated 2D painting solution for Qt Quick and QRhi-based render targets."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6CanvasPainter6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a3fb55e48b3b27f3979dcbd81d1ea6fbd9024c8ecb9ffeb926039d04a0e250493739889b7a04a166750fe4bb7e0708e6dede57836bf1f29fafe17f84a99e04b4"

RPROVIDES:${PN} += "libQt6CanvasPainter.so.6 \
libQt6CanvasPainter6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
