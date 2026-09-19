SUMMARY = "QML API for rendering graphics and animation"
DESCRIPTION = "Qt Lottie Animation provides a QML API for rendering graphics and animations \
that are exported in JSON format by the Lottie plugin."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottie-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7c55bb64647298c2a22950e5d340738f7e76eb8070c9cf0200d4f99c25ec05d4615a29f98d2edd0541621683ec7b571124ca0a870ca5db863817469ff441846e"

RPROVIDES:${PN} += "libqlottievectorimage.so \
qt6-lottie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Lottie.so.6 \
libQt6LottieVectorImageGenerator.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickVectorImageGenerator.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
