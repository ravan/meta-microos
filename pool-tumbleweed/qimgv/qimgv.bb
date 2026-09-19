SUMMARY = "Qt6 image viewer"
DESCRIPTION = "Qt6 image viewer with webm support."
LICENSE = "GPL-3.0-only"

PV = "1.0.3a+git20241011.a4d475fa"

RPM_NAME = "qimgv-1.0.3a+git20241011.a4d475fa-1.9.aarch64.rpm"
RPM_HASH = "040c6a3baca3a3429ea034e729f4501b250496075db9694c766586a2d566ea54e513b17f585622e7ee3ae8167d257525b7ca87732c5a9b1518341d6163a2fa8d"

RPROVIDES:${PN} += "qimgv"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libmpv.so.2 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6 \
mpv"

inherit rpm
