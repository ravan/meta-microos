SUMMARY = "Qt 6 LottieVectorImageGeneratorPrivate library"
DESCRIPTION = "The Qt 6 LottieVectorImageGeneratorPrivate library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6LottieVectorImageGenerator6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "53e2e333623675d48817be14672d4b97137470f735ff947561b2c13e042a6830d0cdd23107bab586b7d70fd1b8d4320e40309b040c15e0cec98d1fc1466aadac"

RPROVIDES:${PN} += "libQt6LottieVectorImageGenerator.so.6 \
libQt6LottieVectorImageGenerator6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Lottie.so.6 \
libQt6QuickVectorImageGenerator.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
