SUMMARY = "Qt 6 LottieVectorImageGeneratorPrivate library - Development files"
DESCRIPTION = "Development files for the Qt 6 LottieVectorImageGeneratorPrivate private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottievectorimagegenerator-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "86bfb48349910099625327ca0c16563a684e874391334149ce1f15f91c3e3c760ba8995b80efb2a950f74c10b967c49828dda4a82f0aa99a2a8347fe78e18ed2"

RPROVIDES:${PN} += "cmake-Qt6LottieVectorImageGeneratorPrivate \
qt6-lottievectorimagegenerator-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Lottie \
cmake-Qt6QuickVectorImageGeneratorPrivate \
libQt6LottieVectorImageGenerator6"

inherit rpm
